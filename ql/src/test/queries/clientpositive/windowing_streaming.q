drop table over10k;

create table over10k(
           t tinyint,
           si smallint,
           i int,
           b bigint,
           f float,
           d double,
           bo boolean,
           s string,
	   ts timestamp, 
           dec decimal(4,2),  
           bin binary)
       row format delimited
       fields terminated by '|';

load data local inpath '../../data/files/over10k' into table over10k;

set hive.limit.pushdown.memory.usage=.8;

-- part tests
explain
select * 
from ( select p_mfgr, rank() over(partition by p_mfgr order by p_name) r from part) a 
;

explain
select * 
from ( select p_mfgr, rank() over(partition by p_mfgr order by p_name) r from part) a 
where r < 4;

select * 
from ( select p_mfgr, rank() over(partition by p_mfgr order by p_name) r from part) a 
where r < 4;

select * 
from ( select p_mfgr, rank() over(partition by p_mfgr order by p_name) r from part) a 
where r < 2;

-- over10k tests
select * 
from (select t, f, rank() over(partition by t order by f) r from over10k) a 
where r < 6 and t < 5;

set hive.cbo.enable=false;
select *
from (select t, f, row_number() over(partition by t order by f) r from over10k) a
where r < 8 and t < 0;
set hive.cbo.enable=true;

set hive.vectorized.execution.enabled=false;
set hive.limit.pushdown.memory.usage=0.8;

explain
select * from (select ctinyint, cdouble, rank() over(partition by ctinyint order by cdouble) r from  alltypesorc) a where r < 5;

drop table if exists sB;
create table sB ROW FORMAT DELIMITED FIELDS TERMINATED BY ','  STORED AS TEXTFILE as  
select * from (select ctinyint, cdouble, rank() over(partition by ctinyint order by cdouble) r from  alltypesorc) a where r < 5;

select * from sB
where ctinyint is null;

set hive.vectorized.execution.enabled=true;
set hive.limit.pushdown.memory.usage=0.8;
drop table if exists sD;
create table sD ROW FORMAT DELIMITED FIELDS TERMINATED BY ','  STORED AS TEXTFILE as  
select * from (select ctinyint, cdouble, rank() over(partition by ctinyint order by cdouble) r from  alltypesorc) a where r < 5;

select * from sD
where ctinyint is null;
