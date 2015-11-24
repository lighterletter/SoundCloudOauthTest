package lighterletter.c4q.oauthtest;


import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by c4q-john on 11/23/15.
 */
public interface SoundCloudService {

    @GET("/tracks?client_id="+Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]")String date, Callback<List<Track>> cb);

}
