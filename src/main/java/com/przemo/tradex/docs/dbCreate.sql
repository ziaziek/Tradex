
create table users(id serial not null primary key,
                    username varchar(50) not null unique,
                    password varchar(50) not null,
                    last_ip_login varchar(15),
                    last_login timestamp not null);

create table account_types(id serial not null primary key,
                            account_name varchar(50) not null,
                            account_description text);

--W tej tabeli znajduja sie dane ask i bid, ktore NIE sa konsekwencja tabeli orders, poniewaz to nie my prowadzimy ten rynek, a jedynie
--jestesmy posrednikami. Generalnie dla celów szkoleniowych, ta tabela będzie wypełniona już danymi, które będą pobieane przez serwer i dostarczane
--zarejestrowanym klientom.
create table accounts(id serial not null primary key,
                        users_id integer not null references users(id),
                        account_number integer not null,
                        balance double precision not null default 0.00,
                        active boolean not null default 'True');

create table equities_types(id serial primary key,
                            type_name varchar(50),
                            description text);

create table equities(id serial primary key,
                        equity_symbol varchar(10) not null unique,
                        equity_type int references equities_types(id),
                        bid_price double precision not null, --last (current) bid
                        ask_price double precision not null,  --last (current) ask
                        description text);

--the following table is for the use of this sofware only (the prices are already known.
--normally, the transactions would imply the bid and ask prices and fill in this table, not the other way round
create table equities_price_history(id bigserial primary key,
                        equity int references equities(id),
                        bid_price double precision not null,
                        ask_price double precision not null,
                        record_date timestamp --date when this price occurs
                    );

create table order_types(id serial primary key,
                            order_type varchar(2) not null,
                            description text not null);

create table orders(id bigserial primary key,
                    users_id integer not null references users(id),
                    equities_id integer not null references equities(id),
                    quantity double precision not null check(quantity>0),
                    initial_quantity double precision not null check(initial_quantity>0),
                    valid_thru timestamp,
                    order_types_id integer not null references order_types(id),
                    min_quantity double precision not null default 0.0);

create table transactions(id bigserial not null primary key,
                            equity_id integer not null references equities(id),
                            buyer_order_id integer not null references orders(id),
                            seller_order_id integer not null references orders(id),
                            quantity double precision not null check(quantity>0),
                            price double precision not null check(price>0),
                            transaction_date timestamp not null default current_timestamp);

create table accounts_history(id bigserial primary key,
                        accounts_id integer not null references accounts(id), --Czy konta zmieniaja wlascicieli? Zakładamy, że nie, czyli jedno konto ma jednego właściciela przez cały czas istnienia
                        transactions_id bigint not null references transactions(id),
                        balance double precision not null,
                        entry_date timestamp not null default current_timestamp);

create table user_sessions(id bigserial primary key,
                            users_id integer not null references users(id),
                            login_time timestamp not null,
                            logout_time timestamp,
                            session_key varchar(128) not null,
                            expiry_date  timestamp not null,
                            login_ip varchar(15));

create table news(id serial primary key,
                    issue_date timestamp not null default current_timestamp,
                    title varchar(50) not null,
                    contents text);
