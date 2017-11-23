# Architectural Design
_A softwares architecture consists of its main structural components (or "sub systems") and the relationship between them_

- links requirements and design processes
- Involves identifying major system components and their communications.
- Often produced in both plan-based and agile processes he architecture shouldn't change much across iterations

- system architecture block diagram
  - boxes represent components
  - arrows indicate communication between components

- Aids in stakeholder communication
- Helps address feasibility of non-functional requirements
- opportunities for code/architecture reuse can be identified.

- Effects on non-functional requirements
  - Performance: Localize critical operations and minimize communication between components
  - security: use a layered architecture with critical assets in inner layers
  - safety: place safety-critical features in a minimal number of components
  - Availability: use redundant components for fault tolerance
  - Maintainability: use replaceable components

#### Architectural Patterns
- 

Common patterns (continued)
- client-server architecture
  - distributed system model illustrating how data and processing is distributed across components
  - typically implemented using servers that clients connect to over a network 
  - useful when data needs to be accessed from various locations
- pipe and filter
  - each component transforms its input data to some other output format
  - data flows from one component to another for processing
  - useful when multiple stages of data processing are needed

