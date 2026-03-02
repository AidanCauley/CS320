The client for this project was Artemis Financial, a financial services company that needed improvements to the security of its web-based software application. The primary concern was protecting sensitive financial data transmitted between systems and users. The company requested a vulnerability assessment of their existing application along with recommendations and implementation of secure communication practices. The goal was to strengthen confidentiality, integrity, and overall application security while maintaining functionality.

Security Vulnerabilities and Importance of Secure Coding

During the vulnerability assessment process, I identified several potential security risks related to insecure communication protocols and outdated dependency components. One major improvement involved implementing HTTPS using SSL certificates to encrypt data transmission. Secure coding is critical because vulnerabilities can expose sensitive financial data, damage a company’s reputation, and lead to financial loss or legal consequences. Strong software security contributes directly to a company’s reliability, customer trust, and long-term success.

Challenges and Learning Experience

One challenging aspect of the project was understanding how cryptographic concepts such as hashing algorithms, certificates, and secure communication protocols integrate into a working software system. However, this challenge also provided valuable learning opportunities. Implementing a SHA-256 hashing function and configuring SSL through a keystore helped deepen my understanding of real-world security implementation in Java applications.

Increasing Layers of Security

To increase layers of security, I implemented HTTPS using a self-signed certificate and refactored the application to include secure hashing for data integrity verification. In the future, I would use automated vulnerability scanning tools, secure dependency management, penetration testing methods, and code reviews to assess vulnerabilities and determine appropriate mitigation techniques.

Verifying Functionality and Security After Refactoring

After refactoring the code, I verified functionality by compiling and running the application successfully in Eclipse and testing endpoints through a web browser using HTTPS. I also attempted to use the OWASP Dependency-Check tool to identify potential vulnerabilities in project dependencies. Although the tool encountered a known external NVD database access issue, I confirmed the application remained functional and secure by reviewing code changes, validating secure communication, and ensuring no runtime errors were introduced.

Tools, Resources, and Coding Practices

Several tools and practices were helpful throughout this project:

Eclipse IDE for development and testing

Maven for dependency management

OWASP Dependency-Check for vulnerability analysis

Java Keytool for certificate generation

Spring Boot framework for secure web application configuration

Secure coding practices such as encryption, hashing, and layered security design

These tools and practices will be valuable for future coursework and professional development in software engineering and cybersecurity.
