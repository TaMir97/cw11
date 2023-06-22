create database grocery;
create table admin
(
    id       serial
        constraint admin_pk
            primary key,
    username varchar,
    password varchar
);
create table users
(
    id            serial
        constraint users_pk
            primary key,
    firstname     varchar,
    lastname      varchar,
    national_code varchar,
    phone_number  varchar,
    address       varchar,
    password      varchar
);
create table fruit
(
    id          serial
        constraint fruit_pk
            primary key,
    name        varchar,
    description varchar,
    stock_state boolean,
    weight_unit varchar,
    weight      double precision,
    rate        integer,
    sticker     varchar
);
create table shipping
(
    id          serial
        constraint shipping_pk
            primary key,
    name        varchar,
    rate        integer,
    arrive_date date
);
create table "order"
(
    id          serial
        constraint order_pk
            primary key,
    user_id     integer
        constraint order_users_id_fk
            references users,
    state       varchar,
    shipping_id integer
        constraint order_shipping_id_fk
            references shipping
);
create table fruit_order
(
    fruit_id integer
        constraint fruit_order_fruit_id_fk
            references fruit,
    oder_id  integer
        constraint fruit_order_order_id_fk
            references "order"
);
