package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.example.demo.entity.CarEngine;


/**
 * @author Efe
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MyCarController.class)
public class MyCarControllerTest
{


  @Autowired
  private MockMvc mvc;

  @InjectMocks
  public MyCarController myCarCont;

  @Mock
  public CarEngine carengine;

  @Before
  public void beforeTest()
  {

  }


  /**
   * <p>
   * Description: xyz
   * </p>
   *
   * @param xyz
   * @return xyz
   * @see <a href="xyz">xyz</a>
   * @throws Exception
   */
  @Test
  public void testYesConfig() throws Exception
  {

    // Test Restschnittstelle
    MvcResult result = this.mvc.perform(get("/mycontroller/auto").accept("application/json")).andExpect(status().isOk()).andReturn();
    Assert.assertEquals(200, result.getResponse().getStatus());
  }



}
