CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    created_date DATE NOT NULL,
    status VARCHAR(50),
    account_id INT,
    describe TEXT
);

CREATE TABLE account (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    dob DATE ,
    phone VARCHAR(50)
);

ALTER TABLE tasks
ADD CONSTRAINT fk_user_id
FOREIGN KEY (account_id)
REFERENCES account(id);
