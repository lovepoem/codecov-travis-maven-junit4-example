
Travis CI + [Codecov][0] + Maven Java Example
===============================
## First step: add code to pom.xml and .travis.yml
1. Add `cobertura-maven-plugin` plugin to your pom.xml file, [see here](https://github.com/codecov/codecov-travis-maven-test/blob/master/pom.xml#L47-L58)
1. Call `mvn cobertura:cobertura` during your CI tests, [see here](https://github.com/codecov/codecov-travis-maven-test/blob/master/.travis.yml#L4)
1. Call `bash <(curl -s https://codecov.io/bash)` at the end of your CI build, [see here](https://github.com/codecov/codecov-travis-maven-test/blob/master/.travis.yml#L7)
  - Using Travis CI, CircleCI or AppVeyor **AND** the repository is public? **You're done!** No token needed.
  - Otherwise, please add your [repository token token][5].

> Other Examples
> - [Java JaCoCo Example][1]
> - [Android Example][3]
> - [Gradle Example][2]



[0]: https://codecov.io/
[1]: https://github.com/codecov/example-java
[2]: https://github.com/codecov/example-gradle
[3]: https://github.com/codecov/example-android
[5]: http://docs.codecov.io/docs/about-the-codecov-bash-uploader#section-upload-token

## Second step: github code master add repository to travis ci and codev

  - login https://travis-ci.org/ and add lovepoem/codecov-travis-maven-test repository to https://travis-ci.org/
  - login https://codecov.io/ and add lovepoem/codecov-travis-maven-test repository to https://codecov.io/

## Third step: add test coverage rate to README.md
[![Build Status](https://travis-ci.org/lovepoem/codecov-travis-maven-test.svg?branch=master)](https://travis-ci.org/lovepoem/codecov-travis-maven-test)
[![codecov](https://codecov.io/gh/lovepoem/codecov-travis-maven-test/branch/master/graph/badge.svg)](https://codecov.io/gh/lovepoem/codecov-travis-maven-test)
