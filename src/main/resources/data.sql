INSERT INTO USERS (name, email, password)
VALUES ('User', 'user@project.com', '{noop}password'),
       ('Admin', 'admin@project.com', '{noop}password');

INSERT INTO USER_ROLES (role, user_id)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);
