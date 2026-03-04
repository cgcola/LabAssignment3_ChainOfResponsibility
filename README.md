# Lab Assignment 3: Chain Of Responsibility (Automated Waste Management System)

### Background:
<p>Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.</p>

### Objective:
<p>Develop an automated waste management system that uses a chain of responsibility pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.</p>

### Requirements:
<ol>
  <li><strong>Waste Container: </strong>Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous).</li>
  <li><strong>Waste Collection Chain: </strong>Implement a chain of responsibility pattern to handle different types of waste containers. Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.</li>
  <li><strong>Waste Collection Process: </strong>
  <ul>
    <li>The system should initialize a chain of waste collectors, each responsible for a different type of waste.</li>
    <li>When a waste container is full or needs disposal, the system should trigger the waste collection process.</li>
    <li>The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container.</li>
  </ul>
  </li>
  <li><strong>Validation: </strong>Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.</li>
</ol>

<hr>

### UML Diagram:
<img width="6388" height="1939" alt="image" src="https://github.com/user-attachments/assets/6548d441-6d07-4ee8-8e18-ee795e6bd32c" />
