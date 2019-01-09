
Travis CI + [Codecov][0] + Junit4 + Maven Java Example
===============================
## 1: Add some code in  pom.xml and .travis.yml
* 1). Add `cobertura-maven-plugin` plugin to your pom.xml file, [see here](https://github.com/lovepoem/codecov-travis-maven-junit4-example/blob/master/pom.xml#L39-L50)
* 2). Call `mvn cobertura:cobertura` during your CI tests, [see here](https://github.com/lovepoem/codecov-travis-maven-junit4-example/blob/master/.travis.yml#L4)
* 3). Call `bash <(curl -s https://codecov.io/bash)` at the end of your CI build, [see here](https://github.com/lovepoem/codecov-travis-maven-junit4-example/blob/master/.travis.yml#L7)
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

## 2 : Add repository to travis ci and codev with github account 

  - login https://travis-ci.org/ and add lovepoem/codecov-travis-maven-junit4-example repository to https://travis-ci.org/
  - login https://codecov.io/ and add lovepoem/codecov-travis-maven-junit4-example repository to https://codecov.io/

## 3: Add travis and codecov icon in  README.md
[![Build Status](https://travis-ci.org/lovepoem/codecov-travis-maven-junit4-example.svg?branch=master)](https://travis-ci.org/lovepoem/codecov-travis-maven-junit4-example)
[![codecov](https://codecov.io/gh/lovepoem/codecov-travis-maven-junit4-example/branch/master/graph/badge.svg)](https://codecov.io/gh/lovepoem/codecov-travis-maven-junit4-example)
