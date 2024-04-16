# Import user data in variety of format
<style>
green { color: green }
yellow { color: yellow }

</style>

We need to allow the user to import their data in variety of format.

- <yellow>Excel Spreadsheet (windows)</yellow>
- <yellow>Number Spreadsheet(Mac)</yellow>
- <yellow>PDF Files</yellow>
- <yellow>Text Files</yellow>

The System should be open to extension because we may need to support other
data format.

## Solution

Using <yellow>Using The Chain Of Responsibilities Pattern</yellow> we can 
achieve the following pipeline:

<yellow>File => 
       SpreadSheetReader -> PDFReader -> NumbersReader -> TextReader </yellow>

``
Read The uploaded File based on the file extension The System will
pick up the appropriate FileReader. Our file will travel through our piple line
if there is an appropriate Reader it will be processed if not The system will display Unsupported file message``



