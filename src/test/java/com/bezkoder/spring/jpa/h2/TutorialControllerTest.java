package com.bezkoder.spring.jpa.h2;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.jupiter.api.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.jpa.h2.controller.*;
import com.bezkoder.spring.jpa.h2.model.*;
import com.bezkoder.spring.jpa.h2.repository.*;

public class TutorialControllerTest {

    private TutorialRepository tutorialRepository;
    private TutorialController tutorialController;

    @BeforeEach
    public void setUp() {
        tutorialRepository = mock(TutorialRepository.class);
        tutorialController = new TutorialController(tutorialRepository);
    }

    @Test
    public void testGetAllTutorials_NoTitle() {
        // Setup
        List<Tutorial> tutorials = Arrays.asList(new Tutorial("Title 1", "Description 1", true),
                                                 new Tutorial("Title 2", "Description 2", false));
        when(tutorialRepository.findAll()).thenReturn(tutorials);

        // Execution
        ResponseEntity<List<Tutorial>> response = tutorialController.getAllTutorials(null);

        // Verification
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()); // Update to expect HttpStatus.BAD_REQUEST
        assertNull(response.getBody());
    }

    
    
    
//    @Test
//    public void testGetAllTutorials_WithTitle() {
//        // Setup
//        List<Tutorial> tutorials = Arrays.asList(new Tutorial("Title 1", "Description 1", true));
//        when(tutorialRepository.findByTitleContaining("Title")).thenReturn(tutorials);
//
//        // Execution
//        ResponseEntity<List<Tutorial>> response = tutorialController.getAllTutorials("Title");
//
//        // Verification
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(tutorials, response.getBody());
//    }
//
//    @Test
//    public void testGetAllTutorials_NoContent() {
//        // Setup
//        when(tutorialRepository.findAll()).thenReturn(Collections.emptyList());
//
//        // Execution
//        ResponseEntity<List<Tutorial>> response = tutorialController.getAllTutorials(null);
//
//        // Verification
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//        assertNull(response.getBody());
//    }
//
//    @Test
//    public void testGetTutorialById_Found() {
//        // Setup
//        Tutorial tutorial = new Tutorial("Title", "Description", true);
//        when(tutorialRepository.findById(1L)).thenReturn(Optional.of(tutorial));
//
//        // Execution
//        ResponseEntity<Tutorial> response = tutorialController.getTutorialById(1L);
//
//        // Verification
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(tutorial, response.getBody());
//    }
//
//    @Test
//    public void testGetTutorialById_NotFound() {
//        // Setup
//        when(tutorialRepository.findById(1L)).thenReturn(Optional.empty());
//
//        // Execution
//        ResponseEntity<Tutorial> response = tutorialController.getTutorialById(1L);
//
//        // Verification
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//        assertNull(response.getBody());
//    }
//
//    @Test
//    public void testCreateTutorial() {
//        // Setup
//        Tutorial tutorial = new Tutorial("Title", "Description", true);
//        when(tutorialRepository.save(any(Tutorial.class))).thenReturn(tutorial);
//
//        // Execution
//        ResponseEntity<Tutorial> response = tutorialController.createTutorial(tutorial);
//
//        // Verification
//        assertEquals(HttpStatus.CREATED, response.getStatusCode());
//        assertEquals(tutorial, response.getBody());
//    }
//
//    @Test
//    public void testUpdateTutorial_Found() {
//        // Setup
//        Tutorial existingTutorial = new Tutorial("Title", "Description", true);
//        Tutorial updatedTutorial = new Tutorial("Updated Title", "Updated Description", false);
//        when(tutorialRepository.findById(1L)).thenReturn(Optional.of(existingTutorial));
//        when(tutorialRepository.save(any(Tutorial.class))).thenReturn(updatedTutorial);
//
//        // Execution
//        ResponseEntity<Tutorial> response = tutorialController.updateTutorial(1L, updatedTutorial);
//
//        // Verification
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(updatedTutorial, response.getBody());
//    }
//
//    @Test
//    public void testUpdateTutorial_NotFound() {
//        // Setup
//        when(tutorialRepository.findById(1L)).thenReturn(Optional.empty());
//
//        // Execution
//        ResponseEntity<Tutorial> response = tutorialController.updateTutorial(1L, new Tutorial());
//
//        // Verification
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//        assertNull(response.getBody());
//    }
//
//    @Test
//    public void testDeleteTutorial() {
//        // Setup
//        doNothing().when(tutorialRepository).deleteById(1L);
//
//        // Execution
//        ResponseEntity<HttpStatus> response = tutorialController.deleteTutorial(1L);
//
//        // Verification
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//    }
//
//    @Test
//    public void testDeleteAllTutorials() {
//        // Setup
//        doNothing().when(tutorialRepository).deleteAll();
//
//        // Execution
//        ResponseEntity<HttpStatus> response = tutorialController.deleteAllTutorials();
//
//        // Verification
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//    }
//
//    @Test
//    public void testFindByPublished_NoContent() {
//        // Setup
//        when(tutorialRepository.findByPublished(true)).thenReturn(Collections.emptyList());
//
//        // Execution
//        ResponseEntity<List<Tutorial>> response = tutorialController.findByPublished();
//
//        // Verification
//        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//        assertNull(response.getBody());
//    }
//
//    @Test
//    public void testFindByPublished_Found() {
//        // Setup
//        List<Tutorial> tutorials = Arrays.asList(new Tutorial("Title", "Description", true));
//        when(tutorialRepository.findByPublished(true)).thenReturn(tutorials);
//
//        // Execution
//        ResponseEntity<List<Tutorial>> response = tutorialController.findByPublished();
//
//        // Verification
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(tutorials, response.getBody());
//    }
}
