SELECT * FROM customer_demo.contacts;
ALTER TABLE contacts
  ADD hoang varchar(40) NOT NULL
    AFTER contact_id;
ALTER TABLE contacts
  ADD minh varchar(40) NOT NULL
    AFTER contact_id,
ADD nguyen varchar(35) NULL
    AFTER first_name;
    ALTER TABLE contacts
  DROP COLUMN hoang;
  ALTER TABLE contacts
  CHANGE COLUMN minh ctype
    varchar(20) NOT NULL;