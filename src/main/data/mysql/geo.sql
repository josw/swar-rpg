create table map (
map_idx integer primary key auto_increment,
location Point not null,
type varchar(10),
amount integer,
owner integer,
SPATIAL KEY `location` (`location`),
UNIQUE KEY `location` (`location`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table user (
user_idx integer primary key auto_increment,
name	varchar(20) not null,
email	varchar(100),
pass	varchar(20)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table castle (
castle_idx	integer primary key auto_increment,
map_idx	integer not null,
amt_gold	integer,
amt_wood	integer,
amt_stone	integer,
amt_star	integer,
people	integer,
building	varchar(100)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table building (
building_idx	integer primary key auto_increment,
req_building	integer,
req_tech	integer,
max_level	integer not null,
build_ratio	float not null,
build_length	integer not null,
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table tech (
building_idx integer not null
name	varchar(20) not null,
req_level	integer not null,
req_building	varchar(100),
req_tech	varchar(100),
max_level	integer
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table military (
military_idx	integer primary key auth_increment,
name	varchar(20) not null,
req_level	integer,
req_tech	varchar(100),
req_gold	integer,
req_wood	integer,
req_stone	integer
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
