# System Modeling
_2/19/16 Lecture 1_
_The process of developing abstract models of a system that describe it from a different perspective_
- Often uses UML notation
- Used by analysts, designers, developers and for communications

#### System Perspectives
- External: model the system's environment
- Interaction: model the interactions between a system and its environment or between components of a system
- Structural: model the organization of a system's data
- Behavioral: Model the dynamic behavior of how the system responds to events

#### UML diagram types
- Activity: activities involved in a process or data processing
- Use Case: interactions between a system and its environment
- Sequence: how objects communicate between eachother
- Class: object classes and associations between classes
- State: how the system reacts to internal and external events

#### System Boundaries
- established to define what is inside and what is outside the system

#### Process perspective
- shows the other systems in the environment, not how the system being dev'd is used in that env.
- how its used in a broader business perspective

#### Activity Diagrams
- models activities involved in a process
  - Filled in dot: process start
  - Circled filled in dot: process end
  - Rounded rectangle: activity
  - Rectangle: Object / System
  - arrows indicate control flow & may be annotated with conditions
  - solid bars indicate activity coordination

##### Sequence Diagrams
- Models sequences of interactions between objects & actors for a single use case
- Actors(stick figures) and objects(rectangles) are listed alone vertical dashed lines
  - objects may be described using name:type format
- arrows indicate interactions and may be annotated with method calls (solid lines) and return values (dashed lines)
- vertical rectangles on dashed vertical lines illustrate object lifelines
- alternative interactions may be surrounded by and "alt" box with conditions in brackets separated by horizontal dashed lines

#### Structural Models

#### Class diagrams
- Often see more class details, variables, methods, return times, params, visibility (public/private), etc..
- Inheritance diagram - hierarchy of relationships  
- classes are identified using rectangles with 3 vertical sections containing the class name, attributes, and methods
- lines may connect classes that reference one another with cardinalities and or annotations describing the relationship
- generalization/specialization is indicated using a line with a hollow arrowhead
- Association is indicated using an arrow with a hollow diamond at the whole class

#### State Diagrams
- models how a system responds to events
- solid circle: start state
- solid circle circled: end state
- states represented using rounded rectangles
  - top section contains state name
  - lower section may include actions that take place in that state
- Events represented using annotated arrows and connect states
  - only events that result in a changed state are specified
- states may be organized as substates within superstates illustrated using a rounded rectangle, surrounding substates
