class Person {
  private String name;
  private int age;
  private String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Gender: " + this.gender);
  }
}

class Doctor extends Person {
  private String specialization;
  private static int doctorCount = 0;

  public Doctor(String name, int age, String gender, String specialization) {
    super(name, age, gender);
    this.specialization = specialization;
    doctorCount++;
  }

  public static int getDoctorCount() {
    return doctorCount;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Specialization: " + this.specialization);
  }
}

class Patient extends Person {
  private String ailment;
  private final int patientId;
  private double[] treatmentCosts;

  public Patient(String name, int age, String gender, String ailment, int patientId, double[] treatmentCosts) {
    super(name, age, gender);
    this.ailment = ailment;
    this.patientId = patientId;
    this.treatmentCosts = treatmentCosts;
  }

  public double calculateTotalTreatmentCost() {
    double total = 0;
    for (double cost : treatmentCosts) {
      total += cost;
    }
    return total;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Ailment: " + this.ailment);
    System.out.println("Patient ID: " + this.patientId);
    System.out.print("Treatment Costs: [");
    for (int i = 0; i < treatmentCosts.length; i++) {
      System.out.print(treatmentCosts[i]);
      if (i < treatmentCosts.length - 1)
        System.out.print(", ");
    }
    System.out.println("]");
    System.out.println("Total Treatment Cost: " + calculateTotalTreatmentCost());
  }
}

class Hospital {
  private Doctor[] doctors;
  private Patient[] patients;
  private int doctorCount;
  private int patientCount;

  public Hospital() {
    doctors = new Doctor[10];
    patients = new Patient[10];
    doctorCount = 0;
    patientCount = 0;
  }

  public void addDoctor(Doctor doc) {
    if (doctorCount < doctors.length) {
      doctors[doctorCount++] = doc;
    } else {
      System.out.println("Cannot add more doctors.");
    }
  }

  public void addPatient(Patient pat) {
    if (patientCount < patients.length) {
      patients[patientCount++] = pat;
    } else {
      System.out.println("Cannot add more patients.");
    }
  }

  public void displayAllDoctors() {
    for (int i = 0; i < doctorCount; i++) {
      System.out.println("Doctor " + (i + 1) + ":");
      doctors[i].displayInfo();
      System.out.println();
    }
  }

  public void displayAllPatients() {
    for (int i = 0; i < patientCount; i++) {
      System.out.println("Patient " + (i + 1) + ":");
      patients[i].displayInfo();
      System.out.println();
    }
  }
}

public class HospitalManagementSystem {
  public static void main(String[] args) {
    Hospital hospital = new Hospital();

    Doctor doc1 = new Doctor("Dr. Alice", 45, "Female", "Cardiology");
    Doctor doc2 = new Doctor("Dr. Bob", 50, "Male", "Neurology");
    hospital.addDoctor(doc1);
    hospital.addDoctor(doc2);

    Patient pat1 = new Patient("John", 30, "Male", "Heart Disease", 1001, new double[] { 5000, 1500, 2500 });
    Patient pat2 = new Patient("Mary", 25, "Female", "Migraine", 1002, new double[] { 2000, 800, 600 });
    hospital.addPatient(pat1);
    hospital.addPatient(pat2);

    hospital.displayAllDoctors();
    hospital.displayAllPatients();

    System.out.println("Total Doctors: " + Doctor.getDoctorCount());
  }
}
