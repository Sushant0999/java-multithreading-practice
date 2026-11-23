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
14. [Modern Java Concurrency & Virtual Threads](#14-modern-java-concurrency--virtual-threads)
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

- [Create a shared counter and increment it using multiple threads.](synchronization/Shared_Counter_With_Multiple_Threads)
- [Demonstrate a race condition using multiple threads.](synchronization/Race_Condition)
- [Fix the race condition using `synchronized`.](synchronization/synchronization/Race_Condition)
- [Implement a thread-safe bank account.](synchronization/Thread_Safe_Bank)
- [Implement deposit and withdrawal operations using multiple threads.](synchronization/Thread_Safe_Bank_II)
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

### 14. Modern Java Concurrency & Virtual Threads

> Use **Java 21** for the main virtual-thread exercises. Items marked **(Java 25)** rely on APIs finalized in Java 25.

#### A. Virtual Thread Fundamentals

- [Create a virtual thread using `Thread.startVirtualThread()`.](virtual_thread_fundamentals/virtual_thread_fundamentals/Create_Virtual_Thread_I)
- [Create a virtual thread using `Thread.ofVirtual().start()`.](virtual_thread_fundamentals/Create_Virtual_Thread_II)
- [Create a virtual thread using `Thread.ofVirtual().unstarted()`.](virtual_thread_fundamentals/Create_Virtual_Thread_III.java)
- [Start an unstarted virtual thread manually.](virtual_thread_fundamentals/Create_Virtual_Thread_III.java)
- [Create virtual threads using `Executors.newVirtualThreadPerTaskExecutor()`.](virtual_thread_fundamentals/Create_Virtual_Threads_Using_Executors)
- [ ] Execute 100 virtual threads simultaneously.
- [ ] Execute 1,000 virtual threads simultaneously.
- [ ] Execute 10,000 virtual threads simultaneously.
- [ ] Print the name and ID of a virtual thread.
- [ ] Check whether a thread is virtual using `Thread.isVirtual()`.
- [ ] Assign names to virtual threads using `Thread.Builder`.
- [ ] Demonstrate virtual thread lifecycle and states.
- [ ] Demonstrate `sleep()`, `join()`, and `interrupt()` with virtual threads.
- [ ] Compare virtual thread creation with platform thread creation.
- [ ] Create virtual threads using a custom `ThreadFactory`.

#### B. Virtual Threads vs Platform Threads

- [ ] Execute 1,000 tasks using platform threads.
- [ ] Execute 1,000 tasks using virtual threads.
- [ ] Execute 10,000 tasks using platform threads.
- [ ] Execute 10,000 tasks using virtual threads.
- [ ] Compare memory consumption between platform and virtual threads.
- [ ] Compare startup time between platform and virtual threads.
- [ ] Compare execution time for I/O-intensive tasks.
- [ ] Compare execution time for CPU-intensive tasks.
- [ ] Demonstrate why virtual threads are suitable for blocking I/O.
- [ ] Demonstrate why virtual threads do not automatically improve CPU-intensive workloads.
- [ ] Compare fixed thread pools with virtual-thread-per-task executors.
- [ ] Measure throughput under different concurrency levels.

#### C. Virtual Thread Executors

- [ ] Execute multiple tasks using `newVirtualThreadPerTaskExecutor()`.
- [ ] Submit `Runnable` tasks to a virtual-thread executor.
- [ ] Submit `Callable` tasks and retrieve results using `Future`.
- [ ] Execute multiple API-like tasks concurrently.
- [ ] Implement graceful shutdown of a virtual-thread executor.
- [ ] Demonstrate `shutdown()` and `close()` on an executor.
- [ ] Implement task cancellation using `Future.cancel()`.
- [ ] Handle exceptions from virtual-thread tasks.
- [ ] Implement timeout handling for virtual-thread tasks.
- [ ] Implement a task-processing system using virtual threads.
- [ ] Implement a custom virtual-thread `ThreadFactory`.
- [ ] Demonstrate why virtual-thread executors should generally not be treated like fixed-size thread pools.

#### D. Blocking Operations and Scheduling

- [ ] Execute `Thread.sleep()` inside a virtual thread.
- [ ] Perform blocking I/O inside virtual threads.
- [ ] Execute multiple tasks that wait for database-like responses.
- [ ] Demonstrate how virtual threads are scheduled on carrier threads.
- [ ] Understand the relationship between virtual threads and carrier threads.
- [ ] Demonstrate virtual-thread unmounting during supported blocking operations.
- [ ] Compare blocking operations in platform and virtual threads.
- [ ] Implement concurrent file reading using virtual threads.
- [ ] Implement concurrent HTTP requests using Java `HttpClient`.
- [ ] Implement a system with thousands of waiting virtual threads.

#### E. Synchronization and Thread Safety with Virtual Threads

- [ ] Implement a shared counter using virtual threads.
- [ ] Implement a thread-safe bank account using virtual threads.
- [ ] Demonstrate race conditions using virtual threads.
- [ ] Fix race conditions using `synchronized`.
- [ ] Implement a shared inventory using virtual threads.
- [ ] Implement a thread-safe Singleton accessed by virtual threads.
- [ ] Use `ReentrantLock` with virtual threads.
- [ ] Use `AtomicInteger` with virtual threads.
- [ ] Implement Producer–Consumer using virtual threads.
- [ ] Implement a bounded buffer using virtual threads.
- [ ] Demonstrate why virtual threads do not eliminate the need for synchronization.
- [ ] Implement a rate limiter for virtual-thread-based requests.
- [ ] Limit concurrent database operations using `Semaphore`.

#### F. Advanced Virtual Thread Concepts

- [ ] Understand virtual thread pinning.
- [ ] Demonstrate virtual thread pinning with intrinsic locks on Java 21.
- [ ] Understand how blocking inside `synchronized` can affect virtual-thread scheduling.
- [ ] Compare intrinsic locks and `ReentrantLock` in virtual-thread workloads.
- [ ] Understand carrier thread scheduling.
- [ ] Explore the virtual-thread scheduler.
- [ ] Understand `jdk.virtualThreadScheduler.parallelism`.
- [ ] Understand `jdk.virtualThreadScheduler.maxPoolSize`.
- [ ] Monitor virtual threads using Java Flight Recorder (JFR).
- [ ] Analyze virtual threads using thread dumps.
- [ ] Understand the impact of `ThreadLocal` on virtual-thread memory consumption.
- [ ] Demonstrate thread-local variables with virtual threads.
- [ ] Use `ScopedValue` to share immutable context across a task hierarchy (Java 25).
- [ ] Explore structured concurrency using `StructuredTaskScope` (Java 25).
- [ ] Implement cancellation and error propagation using structured concurrency.
- [ ] Compare structured concurrency with `CompletableFuture`.

#### G. Real-World Virtual Thread Problems

- [ ] Build a REST API simulator handling 10,000 concurrent requests.
- [ ] Implement concurrent HTTP calls using virtual threads.
- [ ] Build a parallel API aggregator using virtual threads.
- [ ] Implement a database connection pool with virtual threads.
- [ ] Build a concurrent file downloader using virtual threads.
- [ ] Implement a concurrent file-processing application.
- [ ] Build a virtual-thread-based order-processing system.
- [ ] Implement concurrent payment processing using virtual threads.
- [ ] Build a notification delivery system using virtual threads.
- [ ] Implement a chat server supporting thousands of concurrent clients.
- [ ] Build a concurrent log-processing application.
- [ ] Implement a rate-limited API client using virtual threads.
- [ ] Build a web crawler using virtual threads.
- [ ] Implement a concurrent inventory reservation system.
- [ ] Build a task scheduler using virtual threads.
- [ ] Implement a retry mechanism for failed virtual-thread tasks.
- [ ] Build a microservice that handles concurrent downstream service calls.
- [ ] Implement graceful cancellation when a client disconnects.
- [ ] Build a bounded request-processing system using virtual threads and semaphores.
- [ ] Implement request tracing and context propagation using scoped values (Java 25).

#### H. Virtual Thread Debugging and Performance

- [ ] Generate a thread dump containing virtual threads.
- [ ] Analyze virtual threads using `jcmd`.
- [ ] Identify virtual-thread pinning using JFR.
- [ ] Monitor carrier thread utilization.
- [ ] Identify excessive memory consumption caused by virtual threads.
- [ ] Benchmark 1,000 platform threads against 1,000 virtual threads.
- [ ] Benchmark 10,000 concurrent I/O operations.
- [ ] Identify bottlenecks in a virtual-thread-based application.
- [ ] Identify database connection pool exhaustion.
- [ ] Identify resource contention in a virtual-thread application.
- [ ] Compare `synchronized` and `ReentrantLock` under virtual-thread workloads.
- [ ] Identify improper use of `ThreadLocal`.
- [ ] Test interruption and cancellation of virtual threads.
- [ ] Write concurrent tests for virtual-thread-based applications.

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
| Core concurrency APIs | Java 8 |
| `CompletableFuture` | Java 8 |
| Virtual threads (preview) | Java 19 |
| Virtual threads (final) | Java 21 |
| `StructuredTaskScope` (preview API) | Java 21 |
| `ScopedValue` (preview API) | Java 21 |
| `ScopedValue` (final) | Java 25 |
| Structured concurrency (final) | Java 25 |

> **Note:** Preview APIs require preview features to be enabled and have changed between releases. Java 25 finalized Scoped Values and Structured Concurrency.

**Recommended setup:** Use **Java 21** as the baseline for the main virtual-thread exercises, and create a separate **Java 25** branch for finalized Structured Concurrency and Scoped Values. Some exercises intentionally cover APIs available in Java 8.

## Virtual Thread Interview Questions

These are particularly useful for senior Java backend interviews:

1. What is the difference between platform threads and virtual threads?
2. Why are virtual threads called lightweight threads?
3. What is a carrier thread?
4. Can virtual threads execute CPU-intensive tasks faster?
5. What happens when a virtual thread performs a blocking operation?
6. What is virtual thread pinning?
7. Why should you avoid pooling virtual threads?
8. Can we use `synchronized` with virtual threads?
9. How do you limit concurrent database connections when using virtual threads?
10. What happens when a virtual thread is interrupted?
11. How does `ThreadLocal` behave with virtual threads?
12. What is structured concurrency?
13. What is the difference between structured concurrency and `CompletableFuture`?
14. How do you debug virtual-thread applications?
15. Can we create millions of virtual threads?
16. When should you prefer platform threads over virtual threads?
17. How do virtual threads improve scalability in Spring Boot applications?
18. Do virtual threads eliminate thread-safety problems?

## Interview Preparation Checklist

- [ ] Complete the foundational thread and synchronization exercises.
- [ ] Practice locks, thread communication, and atomic operations.
- [ ] Work through executors, thread pools, and concurrent collections.
- [ ] Understand the Java Memory Model and common thread-safety problems.
- [ ] Practice virtual threads, pinning, and structured concurrency.
- [ ] Solve real-world concurrency scenarios.
- [ ] Practice thread dumps, debugging, and performance comparisons.
- [ ] Reimplement important problems without referring to previous solutions.

---

**Repository:** `java-multithreading-practice`

**Happy coding!** 🚀