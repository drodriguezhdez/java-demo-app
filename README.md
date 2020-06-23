[![Scope](https://app.scope.dev/api/badge/25b7823d-1828-4cc8-8d76-39db42e27ba7/default)](https://app.scope.dev/external/v1/inspect/f0a213f0-b550-4bb0-a651-c1d5b9eff041/25b7823d-1828-4cc8-8d76-39db42e27ba7/default)

# Java-demo-app

Demo project for Java server application.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for developing and testing purposes.

### Prerequisites

1. Install Java JDK 1.8+
2. Download and configure Scope for Mac/Windows [here](https://app.scope.dev/local-dev/instructions). For other platforms (including Linux), manually set up the SCOPE_DSN for local development as shown [here](https://app.scope.dev/local-dev/manual-setup)

### Installing

1. Clone repository
```bash
> git clone https://github.com/scope-demo-app/java-demo-app.git
```

2. Access to cloned repository folder
```bash
> cd java-demo-app
```

### Running the tests

This project is already configured with Scope. You just need to run the tests using the following command:

```bash
java-demo-app > ./mvnw clean verify
```

### Reviewing the tests

After the tests run, you'll get a URL in the console with a direct link to the test results:

```bash
** Scope Test Report **
Access the detailed test report for this build at:
   https://app.scope.dev/external/v1/results/a88da6e8-c817-450f-8542-340aa3143d0a
```

Alternatively, the `Scope for Mac` and `Scope for Windows` applications will also show recent runs. Clicking on these will take you directly to the test reports.

To access these results from Scope, simply click on the [Scratchpad](https://app.scope.dev/local-dev/) section in the left-hand menu. You'll get a time-ordered list of local test runs.

When reviewing the tests in Scope, filter by `demotest` in the search bar to find the most interesting tests. Other tests, particularly those tagged as `dummy` may not contain useful, nor interesting information.



