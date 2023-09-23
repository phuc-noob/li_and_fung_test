CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    create_date DATE NOT NULL,
    status VARCHAR(50),
    describe TEXT
);
