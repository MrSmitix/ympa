-module(ympa_erlang_client_feedback_grades_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_grades_dto/0]).

-type ympa_erlang_client_feedback_grades_dto() ::
    #{ 'average' => integer(),
       'agreeCount' => integer(),
       'rejectCount' => integer(),
       'factors' := list()
     }.

encode(#{ 'average' := Average,
          'agreeCount' := AgreeCount,
          'rejectCount' := RejectCount,
          'factors' := Factors
        }) ->
    #{ 'average' => Average,
       'agreeCount' => AgreeCount,
       'rejectCount' => RejectCount,
       'factors' => Factors
     }.
