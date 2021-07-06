package org.roda_project.commons_ip2.validator.component;

import org.roda_project.commons_ip2.mets_v1_12.beans.Mets;
import org.roda_project.commons_ip2.validator.common.FolderManager;
import org.roda_project.commons_ip2.validator.common.ZipManager;
import org.roda_project.commons_ip2.validator.observer.ValidationObserver;
import org.roda_project.commons_ip2.validator.reporter.ValidationReporter;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * @author João Gomes <jgomes@keep.pt>
 */

public interface ValidatorComponent {

  void setEARKSIPpath(Path path);

  void setReporter(ValidationReporter reporter);

  void setMets(Mets mets);

  void setZipManager(ZipManager zipManager);

  void setFolderManager(FolderManager folderManager);

  void setObserver(ValidationObserver observer);

  boolean validate() throws IOException;

  boolean isZipFileFlag();

  void setZipFileFlag(boolean zipFileFlag);

  void setIds(List<String> ids);

  void clean();
}
