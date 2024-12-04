# 🧪 HealthWatch: Java Clinical Monitoring System

## 📋 Brief Description
HealthWatch is a clinical analysis monitoring system developed in Java that uses the Observer pattern to automatically detect and notify critical changes in patients' iron levels.

---

# 📚 README.md

# 🧪 HealthWatch
> Smart real-time clinical analysis monitoring

## 🌟 Features
- ✨ Automatic iron level monitoring
- 📊 Real-time notification system
- 👥 Patient data management
- 🔄 Observer pattern implementation
- 📱 Multiple clinical parameters tracking

## 🛠️ Technologies Used
- Java ☕
- JavaBeans 🔧
- PropertyChangeListener 👂
- Serializable 💾

## 🚀 Installation
1. Clone this repository
```bash
git clone https://github.com/yourUsername/HealthWatch.git
```

2. Open the project in your favorite IDE

3. Compile and run the `Hospital.java` class

## 📝 Usage Example
```java
// Create a new patient
Patient patient = new Patient("John", "Doe", 30, 123456789, 5, 12, 35);

// Create analysis system
GenerateAnalysis analysis = new GenerateAnalysis();

// Connect patient with analysis system
analysis.setPatient(patient);
patient.addPropertyChangeListener(analysis);

// System will automatically notify if iron levels exceed 10
patient.setIronLevel(12);
```

## 🏗️ Project Structure
```
src/
├── clinicalanalysis/
│   ├── Hospital.java        # Entry point
│   ├── Patient.java        # Patient model
│   └── GenerateAnalysis.java # Monitoring system
```

## 📋 System Requirements
- Java JDK 8 or higher
- Java-compatible IDE (Eclipse, IntelliJ, NetBeans)

## 🔍 Key Features
- Automatic iron level monitoring
- Alert system when values exceed critical thresholds
- Complete patient data management
- Clinical values history tracking

## 👩‍💻 Development
Project developed as part of the second year of Cross-platform Application Development, implementing design patterns and object-oriented programming.

## ✨ Contributing
1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazingFeature`)
3. Commit your changes (`git commit -m 'Add: amazing feature'`)
4. Push to the branch (`git push origin feature/amazingFeature`)
5. Open a Pull Request

## 📜 License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## 📞 Contact
- Ornella Gigante - [LinkedIn](https://www.linkedin.com/in/ornella-gigante/)
- Email - ornella-gigante@hotmail.com.ar

## 🙋‍♂️ Author
Created with ❤️ by Ornella-Gigante

⭐️ If this project helped you, please consider giving it a star on GitHub!

