# Observer Pattern

## Problem we are trying to solve

We have DataSource (Database, file on the hard drive,...) ,Chart ui Component
and a couple of spreadSheet files. both of the chart and spreadsheet are two
separate human-readable view of the datasource.
What we want is whenever an update takes place on the data source the chart and
the spreadsheet need to update themselves.

## Solution

The Observer design pattern can solve the problem in this case.
The DataSource Will be our subject that we want to observe, the chart
and the spreadsheet will be the observers.

We are not concerned with a real implementation of the observers what we will
do is a basic implementation of the observers and Subject with any real business
logic. We will focus on how to use the Observer pattern to solve the problem.
