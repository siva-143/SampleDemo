# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  empno                         integer,
  ename                         varchar(255),
  age                           integer
);

create table person (
  id                            integer auto_increment not null,
  name                          varchar(255),
  constraint pk_person primary key (id)
);

create table student (
  sno                           integer auto_increment not null,
  sage                          integer,
  sname                         varchar(255),
  constraint pk_student primary key (sno)
);


# --- !Downs

drop table if exists employee;

drop table if exists person;

drop table if exists student;

