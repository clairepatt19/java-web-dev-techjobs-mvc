package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.columnChoices;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

   @PostMapping(value = "/results")
   public String displaySearchResults(@RequestParam(value='column.key'}, String searchType, String searchTerm) {
        @RequestParam(value="${column.key}")
        model.addAttribute("columns", columnChoices);
        model.addAttribute("searchType", searchType);
        model.addAttribute("searchTerm", searchTerm);
        return "search";
    }

  }
