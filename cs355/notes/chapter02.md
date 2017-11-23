== 1/29/2016 ==
# The Software Process
_A structured set of activities required to develop a software system_

Core Components
- Specification: what does your product need
- Design and Implementation: Create and Develop the software
- Validation: Ensure the software meets the client's needs
- Evolution: Adjust the software as the client's needs or Market's wants change

## Plan Driven vs Agile Development
- Plan Driven: All of the process activities are planned in advance and progress is measured against this plan
- Agile Driven: Planning is incremental and it is easier to hange the process to reflect changing customer req's
In practice most practical processes include elements of both plan-driven and agile approaches

#### Waterfall Model
Plan-driven model. Each phase creates documentation that must be fulfilled before moving to the next phase.
- Requirements analysis and definition (spec)
- System and Software Design
- Implementation and unit testing
- Integration and system testing
- Operation and maintenance 
- Problems:
    - Inflexible partitioning of the project, difficult to respond to client's needs changes.
    - Makes this model only good when the requirements are well-understood and changes will be limited

#### Incremental Model
Spec, dev, and validation are interleaved. plan-driven or agile
- Outline Description - basic overview of requirements
- Specification: initial version
- Development: intermediate versions
- Validation: final version
- Benefits
    - Changes to software is expected and is handled easily and quickly
    - Easier to get customer feedback throughout development
    - Swifter development to delivery timeline
- Problems
    - Process is not visible, documentation is generally not created till the final release.
    - System structure tends to degrade over time. The code style changes, and needs to be refactored.

#### Reuse-oriented Model
Based on systematic reuse where systems are integrated from existing components or COTS (Commercial-off-the-shelf) systems
- Requirements Specification
- Component analysis
- Requirements modification
- System design with reuse
- Development and integration
- System Validation
- Examples:
    - Web services, software libraries, stand-alone COTS software

## Process Activities
- Technical, Collaborative, and managerial activities with the overall goal of specifying, designing, implementing and testing a software system

#### Software Specification
_The process of establishing what services are required and the constraints on the system's operation and development_
- Requirements Engineering Process
    - Feasibility study: is it technically and financially feasible to build the system?
        - Feasibility Report is generally a result of this phase
    - Requirements elicitation and analysis: What does the client require or expect from the system?
        - Generate models needed for the system
    - Requirements Specification: Defining the requirements in detail
        - User and system requirements
    - Requirements Validation: Checking the validity of the requirements
        - Requirements document is written

### Design and Implementation
_The process of converting the system specification into an executable system_
- Design a software structure that realises the specification
- Translate the structure into an executable program
- Model: 
    - Design inputs
        - Platform information
        - Requirements specification
        - Data description
    - Design activities
        - Architectural design
        - Interface design
        - Component design
        - Database design
    - Design outputs
        - System architecture
        - Database specification
        - interface specification
        - Component specification

== 02/01/2016 ==
#### Software Validation
- Verification and validation (V&V) is intended to show that a system conforms to its specification and meets the requirements of the client
- checking and review processes and system tests
- executing the system with test cases derived from the specs of the real data to be processed (rpsec, factories, or seeded data)
- Component Testing, System Testing, Acceptance Testing

#### Software Evolution
- Software is inherently flexible and can change as requirements from the client change

- Change avoidence: the process includes activities to anticipate change
    - example: software prototype - crud functionality to give a basic idea of what happens. then refine further down from there.
- Incremental delivery allows for change in the process by delivering a part of the product's functionality and adjust based on the client's feedback

#### The Rational Unified Process
_A modern generic process derived from the work on the UML and associated process_
- includes aspects of waterfall, iterative, and reuse-oriented process models
- described from 3 perspectives, dynamic, static, and practice
    - Inception: establish the business case for the system
    - Elaboration: Develop an understanding of the problem domain and the system architecture
    - Construction: System design, programming and testing
    - Transition: Deploy the system
- In-phase iteration: Each phase can be iterated
- Cross-phase iteration: can be iterated at any step in the process
- Good Practices:
    - Develop Iteratively
    - Verify Software Quality
    - Control Changes to the Software
