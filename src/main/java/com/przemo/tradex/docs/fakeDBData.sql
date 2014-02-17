--insert some fake data
insert into Accounts(account_number, active, balance, users_id) values(125158, 'True', 100.00, 2);
insert into equities_types(type_name, description) values('Currency', 'Currency pairs');
insert into equities(equity_symbol, equity_type, description, ask_Price, bid_Price) values('EURGBP', 1, 'EUR/GBP', 0.8345, 0.8537),
                                                                                            ('EURUSD', 1, 'EUR/USD', 1.5674, 1.5893);
