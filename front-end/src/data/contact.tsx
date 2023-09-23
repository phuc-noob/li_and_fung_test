export const contacts = [
  createData('Hugo Dubois', '(555) 345-6789', "123 Main St, City, Country", "30", "jessica.lee890@protonmail.com"),
  createData('Michial Phan', '(555) 234-5678', "456 Elm Avenue, Suite 7, Willowville, NY 67890", "20", "john.smith123@gmail.com"),
  createData('Phuc Phan', '(555) 567-8901', "789 Oak Lane, Unit 12, Cedarville, TX 45678", "10", "sarah.johnson456@hotmail.com"),
  createData('Hiroshi Nakamura', '(555) 678-9012', " 321 Pine Road, Apartment 3C, Lakeview, FL 23456", "40", "chris.white234@gmail.com"),
  createData('Sofia Papadopoulos', '(555) 789-0123', "567 Maple Street, Suite 9A, Brookside, AZ 89012", "35", "william.turner567@hotmail.com"),
  createData('Priya Patel ', '(555) 789-0123', " 890 Birch Lane, Apt 5D, Woodville, IL 34567", "25", "sophia.wilson678@mail.com"),
  createData('Amara Nkosi', '(555) 890-1234', "234 Willow Avenue, Unit 6B, Springdale, GA 56789", "60", "ethan.jackson234@gmail.com"),
  createData('Amina Juma', '(555) 901-2345', "678 Cedar Road, Apartment 8E, Pineville, WA 67890", "50",   "daniel.taylor123@yahoo.com"),
  createData('Kai Johnson ', '(555) 012-3456', " 432 Oak Lane, Suite 2F, Riverside, MA 12345", "30", "matthew.harris890@hotmail.com"),
  createData('Lars Hansen ', '(555) 432-1098', "5678 Maple Avenue, Suite 11C, Forestville, NC 89012", "30", "john@example.com"),
];

function createData(
  name: string,
  phone: string,
  address: string,
  age: string,
  email: string
): Data {
  return { name, phone, address, age, email };
}

interface Data {
  name: string;
  phone: string;
  address: string;
  age: string;
  email: string;
}