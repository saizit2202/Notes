Collections

1. List Interface -> Collection Interface -> Iterator Interface
2. ArrayList extends AbstractList implements List, Randomaccess, cloneable, serializable


Concurrent Modification why it happens -> https://www.digitalocean.com/community/tutorials/java-util-concurrentmodificationexception

Arraylist class which check the mod that means total count of the list while using the next(), so before and after sixe will vary it will throw this error
In Hashmap => HashIterator class will have the mod count check 


avoid concurrentmodificationexception by this way:
1.CopyOnWriteArrayList
2.ConcurrentHashMap