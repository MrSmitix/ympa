-module(ympa_erlang_client_feed_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_dto/0]).

-type ympa_erlang_client_feed_dto() ::
    #{ 'id' => integer(),
       'login' => binary(),
       'name' => binary(),
       'password' => binary(),
       'uploadDate' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'url' => binary(),
       'content' => ympa_erlang_client_feed_content_dto:ympa_erlang_client_feed_content_dto(),
       'download' => ympa_erlang_client_feed_download_dto:ympa_erlang_client_feed_download_dto(),
       'placement' => ympa_erlang_client_feed_placement_dto:ympa_erlang_client_feed_placement_dto(),
       'publication' => ympa_erlang_client_feed_publication_dto:ympa_erlang_client_feed_publication_dto()
     }.

encode(#{ 'id' := Id,
          'login' := Login,
          'name' := Name,
          'password' := Password,
          'uploadDate' := UploadDate,
          'url' := Url,
          'content' := Content,
          'download' := Download,
          'placement' := Placement,
          'publication' := Publication
        }) ->
    #{ 'id' => Id,
       'login' => Login,
       'name' => Name,
       'password' => Password,
       'uploadDate' => UploadDate,
       'url' => Url,
       'content' => Content,
       'download' => Download,
       'placement' => Placement,
       'publication' => Publication
     }.
