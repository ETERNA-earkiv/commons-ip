# Changelog

## 2.8.1 (2024-11-05)
### Bug fixes:

* Issue with the Paths library having different behavior depending on the OS.


## 2.8.0 (2024-08-01)
### New features:

* Support for E-ARK CSIP version 2.2.0 (creation and validation)

### Security:

* Several dependency upgrades to fix security vulnerabilities


## 2.7.0 (2024-07-31)
### New features:

* Add option to disable file integrity validation, [Issue #280](https://github.com/keeps/commons-ip/issues/280)
* Create different writing output strategies when creating an E-ARK SIP, [Issue #125](https://github.com/keeps/commons-ip/issues/125)

### Bug fixes:

* Fix relative path validation, [Issue #278](https://github.com/keeps/commons-ip/issues/278)

### Enhancements

* Provide more information during the validation process, [Issue #266](https://github.com/keeps/commons-ip/issues/266)

### Security:

* Several dependency upgrades to fix security vulnerabilities

Thanks to [@mrBaas](https://github.com/mrBaas) for his contributions.


## 2.6.2 (2024-03-13)
### Bug fixes:

* NPE when instantiating EARKSIP without a version #254 (Thanks [@ThomasEdvardsen](https://github.com/ThomasEdvardsen))
* Issue with Incorrect Checksum for representation METS in SIP Creation, [Issue #250](https://github.com/keeps/commons-ip/issues/250)

### Security:

* Several dependency upgrades to fix security vulnerabilities


## 2.6.1 (2024-02-21)
### Bug fixes:

* Remove logback.xml file from Jar


## 2.6.0 (2024-02-02)
### New features:

* Support for Jakarta EE 10

### Bug fixes:

* Exception in thread "main" java.lang.ClassCastException: org.roda_project.commons_ip2.mets_v1_12.beans.AmdSecType cannot be cast to org.roda_project.commons_ip2.mets_v1_12.beans.MdSecType, [Issue #213](https://github.com/keeps/commons-ip/issues/213)

### Security:

* Several dependency upgrades to fix security vulnerabilities


## 2.5.0 (2023-10-20)
### New features:

* Support for E-ARK CSIP version 2.1.0 (creation and validation)
* Using JDK 17 instead of JDK8
* New CLI using [Picocli](https://github.com/remkop/picocli). See the README.md or type --help to know about the available options and commands

### Bug fixes:

* Validation of representation without descriptive metadata files generates NullPointerException, [Issue #204](https://github.com/keeps/commons-ip/issues/204) (thanks [@ThomasEdvardsen](https://github.com/ThomasEdvardsen))
* If the top-level structural division element’s LABEL is missing, a NullPointerException is thrown, [Issue #205](https://github.com/keeps/commons-ip/issues/205)
* Does not validate root METS against SIP/AIP specification when no representation METS exists, [Issue #207](https://github.com/keeps/commons-ip/issues/207)

### Security:

* Several dependency upgrades to fix security vulnerabilities


## 2.4.0 (2023-08-07)
### New features:

* Option to add multiple schemas, [Issue #191](https://github.com/keeps/commons-ip/issues/191) [[#178](https://github.com/keeps/commons-ip/issues/178)]
* Allow to set the checksum algorithm when creating a SIP, [Issue #63](https://github.com/keeps/commons-ip/issues/63)
* Allow adding only the contents of a target representation folder, [Issue #123](https://github.com/keeps/commons-ip/issues/123)

### Enhancements:

* Allow adding multiple metadata files and representations via the CLI, [Issue #121](https://github.com/keeps/commons-ip/issues/121)
* Software version METS agent note is empty when generating SIPs in development mode, [Issue #119](https://github.com/keeps/commons-ip/issues/119)

### Bug fixes:

* Cannot create SIP with ID containing non-filesystem-safe characters, [Issue #117](https://github.com/keeps/commons-ip/issues/117)
* CSIP106 validation fails due to ID not being unique across Package and Representation METS, [Issue #180](https://github.com/keeps/commons-ip/issues/180)
* Validation module: CSIP17 dependent on whether descriptive metadata files exist or not?, [Issue #157](https://github.com/keeps/commons-ip/issues/157)
* Administrative metadata only handled for preservation metadata / digiprovMD, [Issue #118](https://github.com/keeps/commons-ip/issues/118)
* Metadata references with MDTYPE "OTHER" should generate OTHERMDTYPE containing the original type information, [Issue #120](https://github.com/keeps/commons-ip/issues/120)
* Allow creation of SIPs without metadata, [Issue #122](https://github.com/keeps/commons-ip/issues/122)
* Validation failure with UNC file paths on Windows, [Issue #126](https://github.com/keeps/commons-ip/issues/126)
* -r flag with option "eark" causing ClassNotFoundException in version 2.3.0, [Issue #132](https://github.com/keeps/commons-ip/issues/132)
* Validation assumes labels on first structMap division, and checks for wrong value (e.g. CSIP86), [Issue #181](https://github.com/keeps/commons-ip/issues/181)
* Validator throws a NullPointerException on missing metsHdr (CSIP117), [Issue #154](https://github.com/keeps/commons-ip/issues/154)
* Validation module: the CSIP24 test seems to not fully cover all scenarios, [Issue #160](https://github.com/keeps/commons-ip/issues/160)
* CSIP88 validation fails despite correctly labeled metadata div, [Issue #165](https://github.com/keeps/commons-ip/issues/165)
* Wrong value for "specification" field in validation report for CSIP72-79, [Issue #166](https://github.com/keeps/commons-ip/issues/166)
* XLink type validation fails when METS elements are in prefixed namespace, [Issue #162](https://github.com/keeps/commons-ip/issues/162)
* SIP2 validation checks against wrong profile, [Issue #161](https://github.com/keeps/commons-ip/issues/161)
* NPE when trying to create the Mets file for an AIP, [Issue #128](https://github.com/keeps/commons-ip/issues/128)

### Security:

* Several dependency upgrades to fix security vulnerabilities


## 2.3.3 (2023-03-24)
### Bug Fixes

* Missing default schemes in METS file, [Issue #146](https://github.com/keeps/commons-ip/issues/146)
* Validation problem when mdRef ID field starts with digits, [Issue #143](https://github.com/keeps/commons-ip/issues/143)


## 2.3.2 (2023-03-16)
### Bug Fixes

* Java 8 compatibility with javax library when handling SIPs with URL encoded characters, [Issue #136](https://github.com/keeps/commons-ip/issues/136)


## 2.3.1 (2023-01-16)
### Bug Fixes

* Sanitized filename from SIP ID, [Issue #130](https://github.com/keeps/commons-ip/issues/130)
* Sanitized SIP directory name and ID, [Issue #133](https://github.com/keeps/commons-ip/issues/133)


## 2.3.0 (2022-12-06)
### Enhancements

* Add support to bagit-java v5.2.0

### Security fixes

* Dependency updates
    * logback-classic to 1.3.5
    * bagit to 5.2.0
    * commons-configuration2 to 2.8.0
    * jdom2 to 2.0.6.1
    * jackson-datatype-threetenbp to 2.12.5


## 2.2.1 (2022-07-13)
### Bug Fixes

* Command-line tool validator throws an exception with an undocumented option, [Issue #109](https://github.com/keeps/commons-ip/issues/109)
* Exception when creating a SIP without representations, [Issue #112](https://github.com/keeps/commons-ip/issues/112)
* Command-line SIP creator gives an error when the metadata is of type other, [Issue #115](https://github.com/keeps/commons-ip/issues/115)

Enhancements

* Improved Documentation of Command-line tool


## 2.2.0 (2022-06-07)
### What's new

* Simple CLI for creating SIPs, [Issue #103](https://github.com/keeps/commons-ip/issues/103)

### Security fixes

* Remove spring-core as a dependency of the PyIP compatible report, [Issue #98](https://github.com/keeps/commons-ip/issues/98)


## 2.1.0 (2022-06-02)
### What's new

* Support for SIP Shallow, [Issue #105](https://github.com/keeps/commons-ip/issues/105)
* Support for folders in METS filegrp and structMap of SIP-S, [Issue #106](https://github.com/keeps/commons-ip/issues/106)
* Support for empty folders in METS of SIP-S, [Issue #107](https://github.com/keeps/commons-ip/issues/107)


## 2.0.1 (2021-12-02)
### Bug Fixes

Null pointer when sip doesn't have any data, documentation and schemas, [Issue #89](https://github.com/keeps/commons-ip/issues/89)


## 2.0.0 (2021-09-23)
### What's new

* Compliance with CSIP 2.0.4, [Issue #42](https://github.com/keeps/commons-ip/issues/42)
* Compliance with SIP 2.0.4, [Issue #43](https://github.com/keeps/commons-ip/issues/43)
* Validation of CSIP and SIP 2.0.4, [Issue #44](https://github.com/keeps/commons-ip/issues/44)

Now you can use commons-ip as a command-line tool to validate E-ARK SIP and AIPs against 2.0.4 specification. You can also use it as a Java library to parse, produce or validate E-ARK SIP 2.0.4.

### Enhancements

* Added verbose option to CLI
* Added E-ARK report

### Bug Fixes

* CSIPSTR1 - Any Information Package MUST be included within a single physical root folder (known as the “Information Package root folder”). For packages presented in an archive format, see CSIPSTR3, the archive MUST unpack to a single root folder, [Issue #47](https://github.com/keeps/commons-ip/issues/47)
* CSIP4 - Used to declare the Content Information Type Specification used when creating the package. Legal values are defined in a fixed vocabulary. The attribute is mandatory for representation level METS documents., [Issue #49](https://github.com/keeps/commons-ip/issues/49)
* CSIP64 - The value in the mets/fileSec/fileGrp/USE is the name of the whole folder structure to the data, [Issue #50](https://github.com/keeps/commons-ip/issues/50)
* CSIP34 - Indicates the status of the package using a fixed vocabulary., [Issue #51](https://github.com/keeps/commons-ip/issues/51)
* SIP23 - The type of the contact person agent is “INDIVIDUAL”., [Issue #52](https://github.com/keeps/commons-ip/issues/52)
* CSIP107 - The package’s representation division element LABEL attribute value must be the path to the representation level METS document. This requirement gives the same value to be used as the requirement named “File group identifier”, [Issue #53](https://github.com/keeps/commons-ip/issues/53)
* CSIP88 - The metadata referenced in the administrative and/or descriptive metadata section is described in the structural map with one sub division. When the transfer consists of only administrative and/or descriptive metadata this is the only sub division that occurs, [Issue #54](https://github.com/keeps/commons-ip/issues/54)
* CSIP95 - The documentation division element in the package uses the value “Documentation” from the vocabulary as the value for the LABEL attribute., [Issue #55](https://github.com/keeps/commons-ip/issues/55)
* CSIP99 - The schema division element’s LABEL attribute has the value “Schemas” from the vocabulary., [Issue #56](https://github.com/keeps/commons-ip/issues/56)
* CSIPSTR5 - The Information Package root folder SHOULD include a folder named metadata, which SHOULD include metadata relevant to the whole package., [Issue #57](https://github.com/keeps/commons-ip/issues/57)
* CSIPSTR10 - The representations folder SHOULD include a sub-folder for each individual representation (i.e. the “representation folder”). Each representation folder should have a string name that is unique within the package scope. For example the name of the representation and/or its creation date might be good candidates as a representation sub-folder name., [Issue #59](https://github.com/keeps/commons-ip/issues/59)
* CSIPSTR12 - The representation folder SHOULD include a metadata file named METS.xml which includes information about the identity and structure of the representation and its components. The recommended best practice is to always have a METS.xml in the representation folder, [Issue #60](https://github.com/keeps/commons-ip/issues/60)
* CSIPSTR11: Detection seems faulty, [Issue #75](https://github.com/keeps/commons-ip/issues/75)
* CSIPSTR13: Detection fault, [Issue #76](https://github.com/keeps/commons-ip/issues/76)
* CSIPSTR15: Schema folder detection, [Issue #77](https://github.com/keeps/commons-ip/issues/77)
* CSIPSTR16: Detection of documentation folder, [Issue #78](https://github.com/keeps/commons-ip/issues/78)
* CSIP1 mets/@OBJID always fires, [Issue #79](https://github.com/keeps/commons-ip/issues/79)
* Parsing of paths from the root METS is faulty, [Issue #80](https://github.com/keeps/commons-ip/issues/80)
* CSIP23 always fires, [Issue #81](https://github.com/keeps/commons-ip/issues/81)
* More informative reporting if the package can't be found, [Issue #82](https://github.com/keeps/commons-ip/issues/82)
* Discrepancies between report results, [Issue #85](https://github.com/keeps/commons-ip/issues/85)


## 2.0.0-beta2 (2021-10-21)
### What's new

* Compliance with CSIP 2.0.4, [Issue #42](https://github.com/keeps/commons-ip/issues/42)
* Compliance with SIP 2.0.4, [Issue #43](https://github.com/keeps/commons-ip/issues/43)

### Enhancements

* Improved validations in the Commons-ip validator.


## 2.0.0-beta1 (2021-09-27)

### What's new

* [Added command-line interface for validation of E-ARK SIPs v2.0.4](https://github.com/keeps/commons-ip#usage)

### Security Fixes

* commons-io from 2.6 to 2.7
* commons-beanutils from 1.9.3 to 1.9.4
* junit from 4.12 to 4.13.1
* commons-configuration2 from 2.3 to 2.7


## 2.0.0-alpha2 (2021-02-04)

* Fixed E-ARK SIP package parsing containing plus char in filename (https://github.com/keeps/commons-ip/issues/29)


## 2.0.0-alpha1 (2019-10-31)

* E-ARK SIP 2 support (E-ARK Common Specification 2.0.1 compliant)
* Fixed file detection not setting mimetype attribute in METS (when detection failed; see https://github.com/keeps/commons-ip/issues/30)


## 1.0.3 (2017-07-12)

* Hungarian SIP related fixes


## 1.0.2 (2017-07-05)

* Hungarian SIP related fixes


## 1.0.1 (2017-06-29)

* Hungarian SIP related fixes


## 1.0.0 (2017-06-22)

* Hungarian type 4 SIP fixes to the mdWrap/@id (https://github.com/keeps/roda-in/issues/302) and struct map to reflect folder structure (https://github.com/keeps/roda-in/issues/304)


## Alpha 30/31 (2017-06-08)

* Almost fully compliant with [Common Specification 1.0](http://dasboard.eu/images/Specifications/CS/Common_Specifications_for_IPs_v10.pdf) (issue #16)
* Fixed METS paths URL encoding (issue #27)


## Alpha 28/29 (2017-04-04)

* Added BagIt implementation (both build and parse)
* Added Hungarian type 4 SIP (just build)
* Added new values to IPStatus (issue #25).


## Alpha 26/27 (2016-12-22)

* Minor fixes/improvements (issue #21).


## Alpha 25 (2016-12-14)

* Now E-ARK AIP is also supported
* Fixed bug that was happening when E-ARK SIP zip file had a different filename from the ID and was causing a validation error (when root folder exists; issue #19).


## Alpha 24 (2016-11-11)

* Now E-ARK SIP zip has a root folder with the sip id as name
* Now it's possible to define the `id` of the metadata file being packaged (needed to support updates in RODA)


## Alpha 22 & 23 (2016-10-31)

* Fixed how relative paths are stored in METS (as anyURI is sensitive to some chars, percentage encoding/decoding is needed)
* IDs in METS are now prefixed with `uuid-` (instead of `ID`)


## Alpha 17, 18, 19, 20 & 21 (2016-10-21)

* Relative paths in METS don't contain anymore any prefix (and, when doing parse, several prefixes are tested for removal in order to ensure backward compatibility).
* Removed unreachable code related to calculating checksums during zip or not (now it is always calculated during).
* Some information about the ZIP generation is available in IPs (e.g. for generating a report after an SIP to ZIP operation).
* Now IPs may have several IDs.
* Dependencies updated.
* Minor fixes.


## Alpha 16 (2016-08-10)

* Representations now have a status attribute (which will be stored in /mets/structMap[@LABEL="E-ARK structural map"]/div/@TYPE).
* All classes that extend IPMetadata have a type (MetadataType).
* Minor fixes.


## Alpha 15 (2016-07-05)

* An IP now has a status attribute (which will be stored in /mets/metsHdr/@RECORDSTATUS).
* IP parent information was replaced by ancestors information (more suitable for information organized hierarchically).


## Alpha 14 (2016-06-23)

* When loading an SIP, METS is validated againts its schema.
* Now all METS IDs are prefixed with the string 'ID'.


## Alpha 13 (2016-05-10)

* Now validation report can be exported to HTML (full and partial).


## Alpha 12 (2016-05-04)

* Improved validation report by making possible to add info entries (before only warn and error were the alternatives).
* Improved E-ARK SIP parsing by filling in validations and more warning/errors.
* Now IPs and Representations have created and modified date.
* IPContentType, RepresentationContentType and MetadataType are no longer just an Enum but instead a class (which has an ENUM but also the otherType field).


## Alpha 11 (2016-04-05)

* Improved E-ARK SIP generation time by doing checksum calculation during ZIP creation.


## Alpha 10 (2016-03-04)

* Now representations are ordered (i.e. when exporting into E-ARK SIP the order by which a representation was added to the SIP is respected).


## Alpha 9 (2016-02-25)

* __MetadataType__ enum now has support for other type (which will be set in OTHERMDTYPE METS attribute; can be used when selecting __MetadataType.OTHER__ enum value).


## Alpha 8 (2016-02-12)

* The __SIP.build__ method now throws _InterruptedException_ and correctly handles, in the rights places in the code, interruptions made to the thread executing the method. And, in that case, unneeded files are properly cleaned up/deleted.


## Alpha 7 (2016-02-11)

* Added more events to SIPObserver (events related to representations/representation processing which are done before SIP packaging, i.e., calculate checksum and other operations that might take awhile).


## Alpha 6 (2016-02-11)

* Removed Parser interface and EARKParser implementation: now this must be done in a concrete SIP class as the IP interface has a static method _parse_. This way, both _build_ and _parse_ code are located in the same class (take EARKSIP as an example).


## Alpha 5 (2016-02-11)

* Refactored code to better use inheritance and interfaces.
* Now SIP implements the Observer Pattern (SIP is observable and SIPObserver, well, you can figure that out).


## Alpha 4 (2016-02-09)

* Almost 100 % done with EARKSIP.build (SIP to ZIP) and EARKParser.parse (ZIP to SIP) Common Specification v0.13 compliant.


## Alpha 3 (2016-02-03)

* Going towards getting the commons-ip compliant with E-ARK Common Specification v0.13.
* Bug fixes (file leaks, etc.).
