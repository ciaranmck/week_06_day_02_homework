import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("Ciaran");
    camera = new Camera();
  }

  @Test
  public void hasName(){
    assertEquals("Ciaran", photographer.getName());
  }

  @Test
  public void testCameraCount(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void testAddCamera(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void testRemoveCamera(){
    photographer.addCamera(camera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }
}