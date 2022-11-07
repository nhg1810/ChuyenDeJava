    $(document).ready(function(){
         $(".enter-search-name").click(function(){
             var inputSearch = $(".input-search").val();
             $(this).attr("href", "/search/search-student-name/"+inputSearch+"");
          });

        $(".enter-search-id").click(function(){
           var inputSearch = $(".input-search").val();
           $(this).attr("href", "/search/search-student-id/"+inputSearch+"");
         });

         $(".enter-search-email").click(function(){
            var inputSearch = $(".input-search").val();
            $(this).attr("href", "/search/search-student-email/"+inputSearch+"");
          });

          $(".enter-search-address").click(function(){
              var inputSearch = $(".input-search").val();
              $(this).attr("href", "/search/search-student-address/"+inputSearch+"");
          });

           $(".enter-search-phone").click(function(){
                var inputSearch = $(".input-search").val();
                $(this).attr("href", "/search/search-student-phone/"+inputSearch+"");
            });

            //search job

             $(".enter-search-job-name").click(function(){
                 var inputSearch = $(".input-search").val();
                 $(this).attr("href", "/graduation/search-job-name/"+inputSearch+"");
              });

            $(".enter-search-job-name-company").click(function(){
               var inputSearch = $(".input-search").val();
               $(this).attr("href", "/graduation/search-job-name-company/"+inputSearch+"");
             });

             $(".enter-search-email").click(function(){
                var inputSearch = $(".input-search").val();
                $(this).attr("href", "/search/search-student-email/"+inputSearch+"");
              });

              $(".enter-search-address").click(function(){
                  var inputSearch = $(".input-search").val();
                  $(this).attr("href", "/search/search-student-address/"+inputSearch+"");
              });

               $(".enter-search-phone").click(function(){
                    var inputSearch = $(".input-search").val();
                    $(this).attr("href", "/search/search-student-phone/"+inputSearch+"");
                });
     });