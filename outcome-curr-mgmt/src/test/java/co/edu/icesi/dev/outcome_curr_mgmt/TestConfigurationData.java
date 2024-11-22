package co.edu.icesi.dev.outcome_curr_mgmt;

import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.curriculum_definition.AcadProgCurriculum;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.curriculum_definition.Course;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.curriculum_qa.CurrMap;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.curriculum_qa.PerfIndicator;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.curriculum_qa.StudOutcome;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.faculty.AcadProgram;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.faculty.AssessmentType;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.faculty.Faculty;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.faculty.PiLvlCateg;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.faculty.Semester;
import co.edu.icesi.dev.outcome_curr_mgmt.model.entity.management.User;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.curriculum_definition.AcadProgCurriculumRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.curriculum_definition.CourseRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.curriculum_qa.CurrMapRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.curriculum_qa.PerfIndicatorRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.curriculum_qa.StudOutcomeRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.faculty.AcadProgramRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.faculty.AssessmentTypeRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.faculty.FacultyRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.faculty.PiLvlCategRepository;
import co.edu.icesi.dev.outcome_curr_mgmt.persistence.faculty.SemesterRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@TestConfiguration
public class TestConfigurationData {

}
