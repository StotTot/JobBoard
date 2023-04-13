drop table if exists receipts;

create table jobs (
	job_id integer auto_increment primary key,
	company varchar,
	title varchar,
	role varchar,
	details varchar,
	years integer,
	minimum decimal,
	maximum decimal,
	posted_date bigint,
	url varchar
);