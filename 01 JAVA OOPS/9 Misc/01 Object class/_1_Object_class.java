// 📍 Object class:
//  Parent class of all classes in Java.
//  Beneficial if you want to refer any object whose type you don't know.

// 📍 Methods of Object class:
//  1. public final Class getClass()
//  >  return the Class class object of this object.
//  >  The Class class can be used to get the metadata of this class.

//  2. public int hashCode()
//  >  returns the hascode number for this object.

//  3. public boolean equals(Object obj)
//  >  compared tye given object to this object.

//  4. protected Object clone() throws CloneNotSupportedException
//  >  creates and returs the exact copy(clone) of this object.

//  5. public String toString()
//  >  returns string representation of this object.

//  6. public final void notify()
//  >  wakes up single thread, waiting on this object's monitor.

//  7. public final void notifyAll()
//  >  wakes up all the thread, waiting on this object's monitor.

//  8. public final void wait(long timeout) throws InterruptedException
//  >  Causes the current thread to wait for the specified milliseconds,
//  >  until another thread notifies(invokes notify() or notifyAll() methods).

//  9. public final void wait(long timeout, int nanos) throws InterruptedException
//  >  Causes the current thread to wait for the specified milliseconds and nanoseconds,
//  >  until another thread notifies(invokes notify() or notifyAll() methods).

//  10. public final void wait() throws InterruptedException
//  >   causes the current thread to wait, until another thread notifies(invokes notify() or notifyAll() methods).

//  11. protected void finalize() throws Throwable
//  >   Is invoked by garbage collector before object is being garbage collected.