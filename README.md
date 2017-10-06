# This sample project shows two issues in cuba EntityInspectorEditor
cuba version 6.6.4 

There were two bugs in entityInspector.edit screen.

# First one:
Entity FirstIssueA has OneToMany relation with FirstIssueB, that has getUserName metaProperty related to other entity. 
When you try to open entity FirstIssueA over entity inspector you will catch exception.
How to reproduce:
1. Create empty FirstIssueA, save and close
2. Create FirstIssueB, link it to already created FirstIssueA instance and link it to some user, save and close
3. Open FirstIssueA instance again
4. Enjoying the error

# Second one:
Entity SecondIssue has readOnly MetaProperty "getUserGroup" related to other non local properties.
During view creation, "myProperty" will be scipped, but component for that property will be created and again you will get UnfetchedAttributeException.

How to reproduce:
1. Create empty SecondIssue, save and close
3. Open SecondIssue instance again
4. Enjoying the error
