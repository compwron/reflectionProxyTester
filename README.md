This is a code sample showing how we have been choosing which implementation to use at runtime based on a toggle.
The reason that we are using reflection is that the two implementations cannot be compiled at the same time
(one uses libraries in a version of java which is higher than the other implementation can be compiled with,
and the other requires a library which interferes with the operation of the server which we deploy the first one to)

We have found that using reflection in this way runs the danger of the string getting out of sync with the filesystem.
So here is a test for how we are using reflection.