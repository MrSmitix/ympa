-module(ympa_erlang_client_goods_feedback_media_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_media_dto/0]).

-type ympa_erlang_client_goods_feedback_media_dto() ::
    #{ 'photos' => list(),
       'videos' => list()
     }.

encode(#{ 'photos' := Photos,
          'videos' := Videos
        }) ->
    #{ 'photos' => Photos,
       'videos' => Videos
     }.
