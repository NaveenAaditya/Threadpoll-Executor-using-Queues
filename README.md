A thread pool is a collection of pre-initialized threads. It facilitates the execution of
N number of tasks using same threads. If tasks are more than the number of
threads created, then tasks need to wait in a queue like structure (FIFO – First in
first out). When any thread completes its execution, it can pick up a new task from
queue and execute it. When all tasks are completed the threads remain active and
wait for more tasks in thread pool. These are preferred over instantiating new
threads for each task when there is a large number of short tasks to be done rather
than a small number of long ones. As compared to creating thread per task, thread
pools avoid running out of resources (processors, cores, memory) by avoiding
unlimited thread creation at a time. After creating certain number of threads, they
typically put the extra tasks in a waiting queue till a thread is available for a new
task. Thread pools improve performance by running multiple tasks simultaneously,
and at the same time they prevent the time and memory overhead incur during
thread creation. Thread pool helps you avoid creating or destroying more threads,
than would really be necessary. I will start by creating a class with a creating the
threads and a queue of tasks. Then implement a method which adds a task to the
task queue and move on from there.

A)General view: I basically made a thread pool executor which is very
interesting and even challenging which helps to execute N number of tasks
using few number of threads.

B)Aim and objective: The main aims is to write a program for thread pool
executor for executing more number of tasks using few number of threads.
The main objectives of the project are:
 Creating a thread pool executor having the basic functionalities to
implement.
 Using Queue data structure to successfully implement the project.

C)System requirements:
H/W: A good and sensitive keyboard to dodge unexpected curves
and obviously a pc.
S/W: Suits all the system requirements as its one of the most basic
one.

 D)Report organization:
The main body of the report is preceded by abstract and introduction while
results, future enhancements, conclusions and references can be found at the
end. The main body contains overview, followed by analysis& design and
finally implementation.

IMPORTANCE OF THREAD POOL:
 Thread pools improve performance by running multiple tasks
simultaneously, and at the same time they prevent the time and memory
overhead incur during thread creation.
 As compared to creating thread per task, thread pools avoid running out of
resources (processors, cores, memory etc.) by avoiding unlimited thread
creation at a time.

ORDER OF IMPLEMENTATION:
 Creates a thread pool that reuses a fixed number of threads to execute any
number of tasks.
 If additional tasks are submitted when all threads are active, they will wait in
the queue until a thread is available.
 When any thread completes its execution, it picks up a new task from queue
and execute it.
 When all tasks are completed the threads remain active and wait for more
tasks in thread pool.
