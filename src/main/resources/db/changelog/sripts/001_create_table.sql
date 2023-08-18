DROP TABLE IF EXISTS extra_field_entry;
DROP TABLE IF EXISTS additional_field_entry;
DROP TABLE IF EXISTS journal_entry;


CREATE TABLE journal_entry
(
    uuid   UUID PRIMARY KEY,
    begda  DATE,
    ennda  DATE,
    field1 CHAR(10),
    field2 CHAR(10)
);

CREATE TABLE additional_field_entry
(
    uuid   UUID PRIMARY KEY,
    field3 CHAR(10),
    field4 CHAR(10)
);
CREATE TABLE extra_field_entry
(
    uuid   UUID PRIMARY KEY,
    field5 CHAR(10),
    field6 CHAR(10)
);

INSERT INTO journal_entry (uuid, begda, ennda, field1, field2)
VALUES ('11111111-1111-1111-1111-111111111111', '2023-08-01', '2023-08-10', 'Value1', 'Value2'),
       ('22222222-2222-2222-2222-222222222222', '2023-08-05', '2023-08-15', 'Value3', 'Value4');

INSERT INTO additional_field_entry (uuid, field3, field4)
VALUES ('11111111-1111-1111-1111-111111111111', 'Field3Val', 'Field4Val'),
       ('33333333-3333-3333-3333-333333333333', 'Field5Val', 'Field6Val');

INSERT INTO extra_field_entry (uuid, field5, field6)
VALUES ('11111111-1111-1111-1111-111111111111', 'Field5Val', 'Field6Val'),
       ('44444444-4444-4444-4444-444444444444', 'Field7Val', 'Field8Val');