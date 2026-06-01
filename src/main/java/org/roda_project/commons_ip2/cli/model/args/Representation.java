package org.roda_project.commons_ip2.cli.model.args;

import picocli.CommandLine;

import java.util.List;

/**
 * @author Miguel Guimarães <mguimaraes@keep.pt>
 */
public class Representation {
  @CommandLine.Option(names = {
    "--representation-data"}, required = true, split = ",", paramLabel = "<path>", description = "Path to representation file")
  List<String> representationData;
  @CommandLine.Option(names = "--representation-content-type", paramLabel = "<type>", description = "Representation content type")
  String representationContentType;
  @CommandLine.Option(names = "--representation-content-information-type", paramLabel = "<type>", description = "Representation content information type")
  String representationContentInformationType;
  @CommandLine.Option(names = "--representation-status", paramLabel = "<status>", description = "Representation status", defaultValue = "ORIGINAL")
  String representationStatus;
  @CommandLine.Option(names = "--representation-id", paramLabel = "<id>", description = "Representation identifier. If not set a default value of rep<number> will be used")
  String representationId;

  public List<String> getRepresentationData() {
    return representationData;
  }

  public String getRepresentationContentType() {
    return representationContentType;
  }

  public String getRepresentationContentInformationType() {
    return representationContentInformationType;
  }

  public String getRepresentationStatus() {
    return representationStatus;
  }

  public String getRepresentationId() {
    return representationId;
  }
}
