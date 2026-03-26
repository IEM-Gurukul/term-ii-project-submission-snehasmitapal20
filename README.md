# Mini Banking System using Layered Architecture

## Problem Statement
The project aims to simulate basic banking operations such as account creation, deposit, withdrawal, and fund transfer. The system is designed using a layered architecture to ensure modularity, maintainability, and separation of concerns.

## Target User
Students, beginners learning Object-Oriented Programming, and small-scale banking simulations.

## Core Features
- Create account (Savings / Checking)
- Deposit money
- Withdraw money
- Transfer funds between accounts
- Check account balance

## OOP Concepts Used
- Encapsulation: Protects sensitive data like account balance
- Inheritance: SavingsAccount and CheckingAccount extend Account
- Polymorphism: Different behavior of withdraw() method
- Abstraction: Service layer hides internal logic

## Architecture Description
- UI Layer: Handles user interaction (Main.java)
- Service Layer: Business logic (AccountService.java)
- Repository Layer: Data storage (AccountRepository.java)
- Model Layer: Core classes (Account, SavingsAccount, CheckingAccount)

## How to Run
1. Navigate to src folder  
2. Compile:
   javac ui/Main.java  
3. Run:
   java ui.Main  