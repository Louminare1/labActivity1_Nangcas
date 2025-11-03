# DFA String Acceptance Checker

## Purpose
This program implements a **Deterministic Finite Automaton (DFA)** that checks whether a binary string (containing only 0s and 1s) ends with **"01"**.

A DFA is a theoretical model of computation that processes strings symbol by symbol and determines if they belong to a specific language. In this case, our language is "all binary strings that end with 01".

---

## DFA States and Transitions

### States:
- **q0**: Start state (also represents strings that don't end with 0 or 01)
- **q1**: We've seen a 0 (waiting for 1 to complete "01")
- **q2**: Accept state (string ends with "01")

### Alphabet:
- `{0, 1}` - The program only accepts binary strings

### Language:
- All strings that end with "01"
- Examples: `01`, `101`, `1101`, `0001`, `1001`

### Transition Table:

| Current State | Input (0) | Input (1) |
|---------------|-----------|-----------|
| q0 (start)    | → q1      | → q0      |
| q1            | → q1      | → q2      |
| q2 (accept)   | → q1      | → q0      |

### Explanation of Transitions:
- **From q0**: 
  - If we read `0`, move to q1 (we might be starting "01")
  - If we read `1`, stay in q0 (string doesn't end with 0)

- **From q1**: 
  - If we read `0`, stay in q1 (keep the most recent 0)
  - If we read `1`, move to q2 (we completed "01"!)

- **From q2**: 
  - If we read `0`, move to q1 (new potential "01" pattern)
  - If we read `1`, move to q0 (pattern broken)

---

## How to Compile and Run

### Prerequisites:
- Java Development Kit (JDK) installed on your computer
- A terminal or command prompt

### Step 1: Compile the Program
Open your terminal/command prompt and navigate to the folder containing `labActivity1_Nangcas.java`, then run:

```bash
javac labActivity1_Nangcas.java
```

This will create a `labActivity1_Nangcas.class` file.

### Step 2: Run the Program
After compiling, run the program with:

```bash
java labActivity1_Nangcas
```

### Step 3: Enter Input
The program will ask you to enter a binary string. Type your string and press Enter.

---

## Example Input/Output

### Example 1: String Ending with "01" (Accepted)
**Input:** `1101`  
**Output:** `Accepted`

![Example 1 - Accepted](https://raw.githubusercontent.com/Louminare1/labActivity1_Nangcas/main/image.png)

---

### Example 2: String NOT Ending with "01" (Rejected)
**Input:** `1110`  
**Output:** `Rejected`

![Example 2 - Rejected](https://raw.githubusercontent.com/Louminare1/labActivity1_Nangcas/main/image-1.png)

---

### Example 3: Simple "01" Pattern (Accepted)
**Input:** `01`  
**Output:** `Accepted`

![Example 3 - Simple Pattern](https://raw.githubusercontent.com/Louminare1/labActivity1_Nangcas/main/image-2.png)

---

### Example 4: Multiple "01" Patterns (Accepted)
**Input:** `10101`  
**Output:** `Accepted`

![Example 4 - Multiple Patterns](https://raw.githubusercontent.com/Louminare1/labActivity1_Nangcas/main/image-3.png)

---

**Author**: Angelou A. Nangcas  
**Course**: Computer Science 
**Date**: November 3, 2025
