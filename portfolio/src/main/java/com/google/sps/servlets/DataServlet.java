// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/** Servlet that returns some example content. TODO: the name of this file */
@WebServlet("/hello")
public class DataServlet extends HttpServlet {
  private List<String> text = new ArrayList<>();

  @Override
  public void init() {
    text.add("My name is Marissa");
    text.add("I have been feeling sick for a bit");
    text.add("Have a good day!");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //TODO: tags must not appear on screen when printing "<h1>Hello Marissa!</h1>"
    response.setContentType("text/html;");
    response.getWriter().println("Hello Marissa!");

    String json = convertToJsonUsingGson(text);
    response.setContentType("applications/json;");
    response.getWriter().println(json);
  }

  // TODO: (nit) Generalize "comments" so that future inputs can use this method too.
  public String convertToJsonUsingGson(List text) {
    Gson gson = new Gson();
    String json = gson.toJson(text);
    return json;
  }

}