(ns assignments.hw2.q3
  (:require
    [assignments.hw2.utils :refer :all]))

(question "Question 3")
(sub-question "Q3: Writing Questions (20 points)")

(sub-sub "1) What is the curse of dimensionality and list three ways to avoid it. (6 points)")

(md
  "### Curse of Dimensionality

 The curse of dimensionality refers to various phenomena that arise when analyzing and organizing data in high-dimensional spaces that do not occur in low-dimensional settings. As the number of features or dimensions grows, the amount of data needed to generalize accurately grows exponentially. This curse makes it challenging for machine learning algorithms to be effective in high dimensions.

 #### Key aspects of the curse of dimensionality:

 ##### 1. Sparsity:
    Data becomes sparse in high dimensions, making it difficult to find patterns.

 ##### 2. Distance Concentration:
    Distances between points become less meaningful as dimensions increase.

 ##### 3. Model Complexity:
    The number of parameters in models often increases exponentially with dimensions.

 #### Three ways to mitigate the curse of dimensionality:

 ##### 1. Dimensionality Reduction:
    - Use techniques like PCA, t-SNE, or autoencoders to reduce the number of features while preserving important information.
    - This helps in visualizing high-dimensional data and can improve model performance.

 ##### 2. Feature Selection:
    - Choose only the most relevant features for your model using methods like Lasso, Ridge regression, or tree-based feature importance.
    - This reduces noise and helps focus on the most informative aspects of the data.

 ##### 3. Regularization:
    - Apply techniques like $L^1$ (Lasso) or $L^2$ (Ridge) regularization to prevent overfitting in high-dimensional spaces.
    - This constrains model complexity and can lead to better generalization.

 #### Additional Strategies
   We could also collect more data, use domain knowledge to guide feature engineering, and employ algorithms that are less sensitive to high dimensionality, such as decision trees or random forests.")

(sub-sub "2) Explain the differences between Ridge penalty and Lasso penalty. (6 points)")

(md
  "### Ridge vs. Lasso

 Ridge ($L^2$) and Lasso ($L^1$) penalties are both regularization techniques used in linear models to prevent overfitting, but they differ in their approach and effects:

 #### 1. Mathematical Formulation:
   - ***Ridge:*** Adds the sum of squared coefficients (L2 norm) to the loss function. Penalty term: $$λ_2 * Σ(β_i^2)$$
   - ***Lasso:*** Adds the sum of absolute values of coefficients (L1 norm) to the loss function. Penalty term: $$λ_1 * Σ|β_i|$$

 #### 2. Effect on Coefficients:
   - ***Ridge:*** Shrinks all coefficients towards zero, but rarely makes them exactly zero.
   - ***Lasso:*** Can shrink coefficients to exactly zero, effectively performing feature selection.

 #### 3. Geometry:
   - ***Ridge:*** Creates a circular (in 2D) or spherical (in higher dimensions) constraint region.
   - ***Lasso:*** Creates a diamond-shaped (in 2D) or pyramidal (in higher dimensions) constraint region.

 #### 4. Solution Characteristics:
   - ***Ridge:*** Always has a unique solution due to the strictly convex nature of its objective function.
   - ***Lasso:*** May have multiple solutions when features are highly correlated.

 #### 5. Feature Selection:
   - ***Ridge:*** Keeps all features but reduces their impact.
   - ***Lasso:*** Can completely eliminate less important features, leading to sparse models.

 #### 6. Handling Correlated Features:
   - ***Ridge:*** Tends to shrink coefficients of correlated features towards each other.
   - ***Lasso:*** Tends to pick one of the correlated features and ignore the others.

 In practice, the choice between Ridge and Lasso depends on the specific problem. Ridge is often preferred when all features are potentially relevant, while Lasso is useful when feature selection is desired or when dealing with high-dimensional data with many irrelevant features)")

(sub-sub "3) Demonstrate your insights for both direct and iterative methods for optimization. (8 points)")

(md "
Direct and iterative methods are two fundamental approaches to optimization in machine learning and numerical computing:

### Direct and Iterative Methods:
     
#### **Direct Methods:**

##### 1. Characteristics:
   - Attempt to solve the problem in a finite number of steps.
   - Often involve matrix operations or analytical solutions.
   - Examples: Gaussian elimination, LU decomposition, closed-form solutions.

##### 2. Advantages and Disadvantages:

| Advantages | Disadvantages |
|------------|---------------|
| Can provide exact solutions for certain problems | May be computationally expensive or infeasible for large-scale problems |
| Often faster for small to medium-sized problems | Can be sensitive to numerical errors in floating-point arithmetic |
| No need to specify convergence criteria or iteration limits | Not always available for complex, non-linear problems |

##### 3. Use Cases:
   - Solving systems of linear equations.
   - Finding eigenvalues and eigenvectors.
   - Least squares problems with closed-form solutions.

#### **Iterative Methods:**

##### 1. Characteristics:
   - Start with an initial guess and progressively refine the solution.
   - Involve repeated application of an algorithm until convergence.
   - Examples: Gradient descent, Newton's method, conjugate gradient.

##### 2. Advantages and Disadvantages:

| Advantages | Disadvantages |
|------------|---------------|
| Can handle large-scale and complex optimization problems | May require many iterations to converge |
| Often more memory-efficient than direct methods | Convergence is not always guaranteed and can depend on initial conditions |
| Can provide approximate solutions quickly, even if not run to full convergence | Need to specify stopping criteria (e.g., tolerance, maximum iterations) |

##### 3. Use Cases:
   - Training of neural networks and other machine learning models.
   - Solving large sparse systems of equations.
   - Optimization problems where direct methods are infeasible.

#### **Insights:**

##### 1. Problem-Dependent Choice: 
   The choice between direct and iterative methods often depends on the specific problem, its size, and structure.

##### 2. Hybrid Approaches:
   Some advanced algorithms combine aspects of both, like using direct methods as preconditioners for iterative methods.

##### 3. Scalability Considerations:
   As problem sizes grow, iterative methods often become the only feasible option due to memory and computational constraints.

##### 4. Accuracy vs. Speed Trade-off:
   Direct methods can provide highly accurate solutions but may be slow for large problems. Iterative methods can often provide good approximate solutions quickly.

##### 5. Robustness:
   Iterative methods can be more robust to certain types of numerical errors and can handle ill-conditioned problems better in some cases.

##### 6. Adaptability:
   Iterative methods are often more adaptable to changes in the problem structure or constraints during the optimization process.

In machine learning, iterative methods are prevalent due to the large-scale nature of many problems and the need for flexibility in handling various loss functions and model architectures. However, understanding both approaches is crucial for selecting the most appropriate method for a given optimization task")