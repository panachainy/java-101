package panachainy.java;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest()
public class AppTest {
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleTestHello() throws Exception {
//        Assert.assertEquals("ssssxxx===", response.getBody(), equals("Hello, World!"));


//        this.mockMvc
//                .perform(post("/putAttachmentData").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
//                        .content(new String(Files.readAllBytes(new ClassPathResource("/mock_data/putAttachment/putAttachmentData.json").getFile().toPath()))))
//                .andExpect(status().isOk()).andExpect(jsonPath("$.code", is(200)))
//                .andExpect(jsonPath("$.status", is("SUCCESS")))
//                .andReturn();

        this.mockMvc
                .perform(get("/hello").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andReturn();
    }
}
