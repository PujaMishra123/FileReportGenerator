Generating report for a system that stores files and files are grouped into collections.
Output: Total size of all files stored, Top N collections where N is user defined


Using composition design pattern to create files and collections and redefined the method of calculating size for files and collections separetely

Collections will return their own size along with size of files and inner collections.
Storing the raw data in arraylist and calculating the size using hashmap<id,size>
