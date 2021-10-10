package dev.vitorvidal.charactercreator.application.service;

import dev.vitorvidal.charactercreator.domain.model.Attribute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@Disabled
class AttributeServiceTest {

    private static final List<Attribute> ATTRIBUTES = new ArrayList<>();
    private static Attribute attribute;
    private static AttributeService serviceMock;

    @BeforeAll
    public static void setupMock() {
        attribute = new Attribute(10, 10, 10, 10, 10, 10);
        ATTRIBUTES.add(attribute);
        ATTRIBUTES.add(attribute);

        serviceMock = Mockito.mock(AttributeService.class);
    }

    @Test
    void testVariableAllocation() {
        Assertions.assertNotNull(attribute);
        Assertions.assertNotNull(ATTRIBUTES);
        Assertions.assertNotNull(serviceMock);
    }

    @Test
    void testGetAllStatusCode() {
        Mockito.when(serviceMock.getAll()).thenReturn(ATTRIBUTES);
        List<Attribute> returnObject = serviceMock.getAll();
        Assertions.assertEquals(ATTRIBUTES, returnObject);
    }

    @Test
    @Disabled("Not Implemented")
    void testLevelUp() {
    }
}