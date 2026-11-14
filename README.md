# Java Multithreading & Concurrency Practice

A hands-on collection of Java coding exercises for building a strong understanding of **multithreading, concurrency, thread safety, and performance**.

Use this repository as a structured practice roadmap for Java interviews and real-world backend development. Work through the topics in order, implement each problem yourself, and revisit the challenging ones without looking at your previous solution.

## Table of Contents

1. [Threads](#1-threads)
2. [Synchronization](#2-synchronization)
3. [Locks](#3-locks)
4. [Thread Communication](#4-thread-communication)
5. [Atomic Variables and CAS](#5-atomic-variables-and-cas)
6. [Concurrency Utilities](#6-concurrency-utilities)
7. [Executor Framework](#7-executor-framework)
8. [Thread Pools](#8-thread-pools)
9. [Concurrent Collections](#9-concurrent-collections)
10. [CompletableFuture](#10-completablefuture)
11. [Thread Safety and Java Memory Model](#11-thread-safety-and-java-memory-model)
12. [Deadlock and Thread Problems](#12-deadlock-and-thread-problems)
13. [Fork/Join Framework](#13-forkjoin-framework)
14. [Modern Java Concurrency](#14-modern-java-concurrency)
15. [Real-World Multithreading Problems](#15-real-world-multithreading-problems)
16. [Debugging and Performance](#16-debugging-and-performance)

---

## How to Use This Repository

- [ ] Read about the concept before attempting its exercises.
- [ ] Implement each problem independently.
- [ ] Test with multiple threads and different input sizes.
- [ ] Check correctness under concurrent execution—not just in a single run.
- [ ] Record what you learned and any edge cases you discovered.
- [ ] Reimplement important problems without referring to your previous solutions.

**Suggested progression:** Start with threads and synchronization, then move to locks, coordination utilities, executors, and concurrent collections. Finish with the Java Memory Model, real-world scenarios, and performance debugging.

## Practice Questions

### 1. Threads

- [Create a thread by extending the `Thread` class](threads/By_Thead_Class.java)
- [Create a thread using the `Runnable` interface](threads/By_Runnable_Interface.java)
- [Create a thread using a lambda expression](threads/By_Lambda.java)
- [Create multiple threads to print numbers from 1 to 100](threads/Print_Numbers.java)
- [Print odd and even numbers using two separate threads](threads/Print_Odd_And_Even.java)
- [Print numbers from 1 to 100 using three threads sequentially](threads/Create_3_Threads.java)
- [Demonstrate starting the same thread twice](threads/Same_Thread_Twice.java)
- [Demonstrate thread states and lifecycle](threads/Thread_Lifecycle.java)
- [Demonstrate `sleep()` and `yield()`](threads/Sleep_N_Yield.java)
- [Create five threads and print their names and IDs](/threads/Threads_With_Name_N_Id.java)
- [Demonstrate the difference between `start()` and `run()`](threads/Start_V_Run.java)
- [Make the main thread wait for child threads using `join()`](threads/Wait_Main_Thread.java)
- [Create a daemon thread](threads/Daemon_Thread.java)
- [Demonstrate thread interruption](threads/Thread_Interruption.java)
- [Execute two different tasks simultaneously using two threads](threads/Two_Threads_Alphabet_Numbers.java)
- [Create a thread-safe counter using multiple threads.](threads/Thread_Safe_Counter.java)

### 2. Synchronization

- [ ] Create a shared counter and increment it using multiple threads.
- [ ] Demonstrate a race condition using multiple threads.
- [ ] Fix the race condition using `synchronized`.
- [ ] Implement a thread-safe bank account.
- [ ] Implement deposit and withdrawal operations using multiple threads.
- [ ] Create a ticket booking system where multiple threads book seats simultaneously.
- [ ] Implement a thread-safe inventory management system.
- [ ] Demonstrate synchronized instance methods.
- [ ] Demonstrate synchronized static methods.
- [ ] Demonstrate synchronized blocks.
- [ ] Implement a thread-safe Singleton class.
- [ ] Create a shared resource accessed by multiple threads.
- [ ] Implement a thread-safe product stock management system.

### 3. Locks

- [Implement a shared counter using `ReentrantLock`.](locks/Shared_Counter_By_Reentrant)
- [Implement a bank account using `ReentrantLock`](locks/BankAccount_ReentrantLock)
- [Demonstrate `tryLock()` using multiple threads.](locks/Try_Lock_Multiple_Threads)
- [Implement a fair lock using `ReentrantLock`](locks/Try_Lock_Multiple_Threads)
- [Implement a reader-writer problem using `ReadWriteLock`](locks/Read_Write_Problem)
- [ ] Implement a shared resource accessed by multiple readers and writers.
- [ ] Implement odd and even number printing using `ReentrantLock` and `Condition`.
- [ ] Implement a thread-safe inventory using locks.
- [ ] Demonstrate `lockInterruptibly()`.
- [ ] Implement a resource manager using multiple locks.
- [ ] Implement a program using `StampedLock`.
- [ ] Create a system where multiple threads safely acquire multiple locks.

### 4. Thread Communication

- [Implement Producer–Consumer using `wait()` and `notify()`.](threads_communication/Producer_Consumer_I.java)
- [Implement Producer–Consumer using `wait()` and `notifyAll()`](threads_communication/Producer_Consumer_II.java)
- [Implement Producer–Consumer using `BlockingQueue`](threads_communication/Producer_Consumer_III.java)
- [Print odd and even numbers sequentially using two threads.](threads_communication/Print_Odd_Even)
- [Print numbers from 1 to 100 using three threads in sequence](threads/Create_3_Threads.java)
- [ ] Implement a bounded buffer using `wait()` and `notify()`.
- [ ] Implement Producer–Consumer using `BlockingQueue`.
- [ ] Implement multiple producers and multiple consumers.
- [ ] Create a message-passing system between two threads.
- [ ] Implement a shared queue with synchronized access.
- [ ] Implement a multithreaded task-processing queue.
- [ ] Implement a bounded buffer using multiple threads.
- [ ] Create a program demonstrating spurious wakeups and condition-loop handling.

### 5. Atomic Variables and CAS

- [ ] Implement a shared counter using `AtomicInteger`.
- [ ] Compare `AtomicInteger` and `synchronized` counters using multiple threads.
- [ ] Implement a sequence generator using `AtomicLong`.
- [ ] Implement a thread-safe flag using `AtomicBoolean`.
- [ ] Implement a shared object reference using `AtomicReference`.
- [ ] Implement a counter using `compareAndSet()`.
- [ ] Implement a lock-free counter.
- [ ] Implement a concurrent ID generator.
- [ ] Implement an atomic inventory update system.
- [ ] Demonstrate the ABA problem with a shared atomic reference.

### 6. Concurrency Utilities

- [ ] Create five worker threads and make the main thread wait using `CountDownLatch`.
- [ ] Implement `CyclicBarrier` with three threads.
- [ ] Allow only three threads to access a resource simultaneously using `Semaphore`.
- [ ] Implement a connection pool using `Semaphore`.
- [ ] Implement a ticket booking system using `Semaphore`.
- [ ] Implement a multi-phase task execution system using `Phaser`.
- [ ] Exchange data between two threads using `Exchanger`.
- [ ] Implement a concurrent service startup system using `CountDownLatch`.
- [ ] Implement a limited-capacity resource manager using `Semaphore`.
- [ ] Implement a parallel task execution system using `CyclicBarrier`.

### 7. Executor Framework

- [ ] Create a fixed thread pool and execute 10 tasks using three threads.
- [ ] Execute multiple `Runnable` tasks using `ExecutorService`.
- [ ] Submit `Callable` tasks and retrieve results using `Future`.
- [ ] Demonstrate the difference between `execute()` and `submit()`.
- [ ] Implement a custom `ThreadFactory`.
- [ ] Create a scheduled task using `ScheduledExecutorService`.
- [ ] Schedule a task to run repeatedly.
- [ ] Implement graceful shutdown of `ExecutorService`.
- [ ] Demonstrate `shutdown()` vs. `shutdownNow()`.
- [ ] Handle exceptions from submitted tasks.
- [ ] Implement a custom `RejectedExecutionHandler`.
- [ ] Implement task cancellation using `Future.cancel()`.
- [ ] Implement a task scheduler with multiple worker threads.
- [ ] Execute multiple independent tasks and collect their results.

### 8. Thread Pools

- [ ] Execute 20 tasks using a fixed thread pool of five threads.
- [ ] Create a single-thread executor and execute multiple tasks.
- [ ] Implement a cached thread pool.
- [ ] Create a custom `ThreadPoolExecutor`.
- [ ] Configure `corePoolSize` and `maximumPoolSize`.
- [ ] Demonstrate how tasks enter the thread pool queue.
- [ ] Implement a bounded queue in `ThreadPoolExecutor`.
- [ ] Demonstrate `AbortPolicy`.
- [ ] Demonstrate `CallerRunsPolicy`.
- [ ] Demonstrate `DiscardPolicy`.
- [ ] Demonstrate `DiscardOldestPolicy`.
- [ ] Implement a thread pool for CPU-intensive tasks.
- [ ] Implement a thread pool for I/O-intensive tasks.
- [ ] Monitor active thread count and pending tasks.
- [ ] Implement a custom thread pool with graceful shutdown.

### 9. Concurrent Collections

- [ ] Implement a thread-safe cache using `ConcurrentHashMap`.
- [ ] Update a shared map using multiple threads.
- [ ] Implement a concurrent word-frequency counter.
- [ ] Implement Producer–Consumer using `ArrayBlockingQueue`.
- [ ] Implement Producer–Consumer using `LinkedBlockingQueue`.
- [ ] Demonstrate `CopyOnWriteArrayList` with multiple readers and writers.
- [ ] Implement a priority-based task queue using `PriorityBlockingQueue`.
- [ ] Implement a message queue using `ConcurrentLinkedQueue`.
- [ ] Implement a concurrent leaderboard using `ConcurrentSkipListMap`.
- [ ] Implement a concurrent inventory cache.
- [ ] Implement a thread-safe shopping cart.
- [ ] Implement a concurrent employee management system.

### 10. CompletableFuture

- [ ] Execute a task asynchronously using `supplyAsync()`.
- [ ] Execute a task asynchronously using `runAsync()`.
- [ ] Transform the result using `thenApply()`.
- [ ] Consume the result using `thenAccept()`.
- [ ] Chain multiple asynchronous operations using `thenCompose()`.
- [ ] Combine two independent tasks using `thenCombine()`.
- [ ] Execute five tasks concurrently using `allOf()`.
- [ ] Return the first completed result using `anyOf()`.
- [ ] Handle exceptions using `exceptionally()`.
- [ ] Handle success and failure using `handle()`.
- [ ] Execute `CompletableFuture` using a custom `Executor`.
- [ ] Implement timeout handling for an asynchronous task.
- [ ] Call three independent APIs concurrently and combine their results.
- [ ] Implement parallel order processing using `CompletableFuture`.
- [ ] Implement a retry mechanism for failed `CompletableFuture` tasks.
- [ ] Implement asynchronous data fetching and transformation.

### 11. Thread Safety and Java Memory Model

- [ ] Demonstrate a visibility problem using a shared boolean variable.
- [ ] Fix the visibility problem using `volatile`.
- [ ] Demonstrate why `volatile` does not guarantee atomicity.
- [ ] Implement a thread-safe Singleton using double-checked locking.
- [ ] Implement safe publication of an immutable object.
- [ ] Demonstrate `ThreadLocal` using multiple threads.
- [ ] Implement separate user contexts using `ThreadLocal`.
- [ ] Demonstrate `ThreadLocal` cleanup using `remove()`.
- [ ] Implement a thread-safe configuration object.
- [ ] Create a program demonstrating happens-before through synchronization.
- [ ] Implement a shared state system using `volatile` and `synchronized`.
- [ ] Demonstrate the difference between `volatile` and `AtomicInteger`.

### 12. Deadlock and Thread Problems

- [ ] Create a deadlock scenario using two threads and two locks.
- [ ] Fix the deadlock using consistent lock ordering.
- [ ] Implement a program demonstrating livelock.
- [ ] Demonstrate thread starvation.
- [ ] Create a race condition using shared data.
- [ ] Fix the race condition using synchronization.
- [ ] Demonstrate lock contention.
- [ ] Implement a system where threads acquire multiple locks safely.
- [ ] Identify deadlocked threads using `ThreadMXBean`.
- [ ] Implement the Dining Philosophers problem.
- [ ] Implement a solution to prevent starvation.
- [ ] Demonstrate safe resource acquisition using multiple locks.

### 13. Fork/Join Framework

- [ ] Implement parallel Merge Sort using `ForkJoinPool`.
- [ ] Calculate the sum of an array using `RecursiveTask`.
- [ ] Implement array processing using `RecursiveAction`.
- [ ] Implement parallel Fibonacci calculation.
- [ ] Calculate the maximum element in an array using `ForkJoinPool`.
- [ ] Implement parallel word counting.
- [ ] Implement parallel matrix processing.
- [ ] Compare sequential and parallel processing performance.
- [ ] Implement a parallel file-processing application.
- [ ] Process a large collection using `ForkJoinPool`.

### 14. Modern Java Concurrency

- [ ] Create a virtual thread using `Thread.startVirtualThread()`.
- [ ] Create virtual threads using `Executors.newVirtualThreadPerTaskExecutor()`.
- [ ] Execute 1,000 concurrent tasks using platform threads.
- [ ] Execute 1,000 concurrent tasks using virtual threads.
- [ ] Compare platform threads and virtual threads.
- [ ] Implement concurrent API calls using virtual threads.
- [ ] Implement task cancellation and resource cleanup.
- [ ] Demonstrate blocking operations using virtual threads.
- [ ] Implement a concurrent file-processing system using virtual threads.
- [ ] Build a virtual-thread-based task processor.

### 15. Real-World Multithreading Problems

- [ ] Design a multithreaded ATM system handling multiple customer withdrawals.
- [ ] Build an online ticket booking system that prevents double booking.
- [ ] Implement a thread-safe LRU Cache.
- [ ] Build a job scheduler supporting task priorities.
- [ ] Implement a rate limiter supporting multiple users independently.
- [ ] Design a logging system with multiple producers and one consumer.
- [ ] Build a parallel API aggregator using `CompletableFuture`.
- [ ] Implement a concurrent inventory system supporting purchase and restocking.
- [ ] Design a bounded message-processing system with multiple consumers.
- [ ] Implement a system where tasks execute in order using multiple threads.
- [ ] Build a parallel data-processing pipeline.
- [ ] Implement a thread-safe database connection pool.
- [ ] Build a job-processing system with duplicate task prevention.
- [ ] Implement concurrent payment processing with idempotency.
- [ ] Build a multithreaded order-processing system.
- [ ] Implement a concurrent notification delivery system.
- [ ] Build a parallel report-generation system.
- [ ] Implement a concurrent file-upload processor.
- [ ] Build a multithreaded log-processing application.
- [ ] Implement a concurrent inventory reservation system.

### 16. Debugging and Performance

- [ ] Generate and analyze a Java thread dump.
- [ ] Identify deadlocked threads using a thread dump.
- [ ] Find the cause of high CPU usage in a multithreaded application.
- [ ] Monitor active threads in `ThreadPoolExecutor`.
- [ ] Identify thread pool exhaustion.
- [ ] Identify resource contention in a shared object.
- [ ] Compare `synchronized` and `ReentrantLock` performance.
- [ ] Compare `AtomicInteger` and `synchronized` counter performance.
- [ ] Benchmark platform threads versus virtual threads.
- [ ] Write concurrent tests to verify thread safety.
- [ ] Identify and fix a `ThreadLocal` memory leak.
- [ ] Detect blocked and waiting threads using `ThreadMXBean`.

---

## Java Version Requirements

The exercises cover APIs from different Java releases. Use a JDK that supports the API being practiced.

| Topic | Minimum Java version |
|---|---:|
| Core threads, synchronization, locks, executors, and concurrent collections | Java 8 |
| `CompletableFuture` | Java 8 |
| Virtual threads (`Thread.startVirtualThread()` and `newVirtualThreadPerTaskExecutor()`) | Java 21 |

**Recommended setup:** Use Java 21 or later to practice the full collection, while keeping in mind that some exercises intentionally cover APIs available in Java 8.

## Interview Preparation Checklist

- [ ] Complete the foundational thread and synchronization exercises.
- [ ] Practice locks, thread communication, and atomic operations.
- [ ] Work through executors, thread pools, and concurrent collections.
- [ ] Understand the Java Memory Model and common thread-safety problems.
- [ ] Solve real-world concurrency scenarios.
- [ ] Practice thread dumps, debugging, and performance comparisons.
- [ ] Reimplement important problems without referring to previous solutions.

---

**Repository:** `java-multithreading-practice`

**Happy coding!** 🚀
