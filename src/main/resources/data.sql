INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
('Ananya Sharma', 'MALE', '1990-05-15', 'ananya.sharma@example.com', 'O_POSITIVE'),
('Diya Patel', 'FEMALE', '1995-08-20', 'diya.patel@example.com', 'A_POSITIVE'),
('Arjun Singh', 'MALE', '1988-12-03', 'arjun.singh@example.com', 'B_NEGATIVE'),
('Neha Iyer', 'FEMALE', '1992-12-01', 'neha.iyer@example.com', 'AB_POSITIVE'),
('Kabir Singh', 'MALE', '1987-07-18', 'kabir.singh@example.com', 'O_POSITIVE');


INSERT INTO doctor (name, specialization, email)
VALUES
('Dr. Ramesh Gupta', 'Cardiology', 'ramesh.gupta@example.com'),
('Dr. Priya Sharma', 'Dermatology', 'priya.sharma@example.com'),
('Dr. Arjun Nair', 'Orthopedics', 'arjun.nair@example.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
('2025-07-01 10:30:00', 'General Checkup', 1, 2),
('2025-07-02 11:00:00', 'Skin Rash', 2, 1),
('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
('2025-07-04 14:30:00', 'Consultation', 1, 4),
('2025-07-05 16:15:00', 'Allergy Treatment', 2, 5);

