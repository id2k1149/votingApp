INSERT INTO USERS (name, email, password)
VALUES ('User', 'user@project.com', '{noop}password'),
       ('Admin', 'admin@project.com', '{noop}password');

INSERT INTO USER_ROLES (role, user_id)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);

INSERT INTO RESTAURANT (name)
VALUES ('RESTAURANT#1'),
       ('RESTAURANT#2');

INSERT INTO DISH (date, name, price, restaurant_id)
VALUES (now()-1, 'DISH #11', 11, 1),
       (now()-1, 'DISH #12', 12, 1),
       (now()-1, 'DISH #23', 23, 2),
       (now()-1, 'DISH #24', 24, 2),
       (now(), 'DISH #15', 15, 1),
       (now(), 'DISH #16', 16, 1),
       (now(), 'DISH #27', 27, 2),
       (now(), 'DISH #28', 28, 2);

INSERT INTO VOTE (date, user_id, restaurant_id)
VALUES (now()-1, 1, 1),
       (now()-1, 2, 2);

