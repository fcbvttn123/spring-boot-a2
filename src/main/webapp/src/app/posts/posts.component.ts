import { Component } from '@angular/core';
import { PostListComponent } from './post-list/post-list.component';
import { PostAddComponent } from './post-add/post-add.component';

@Component({
  selector: 'app-posts',
  standalone: true,
  imports: [PostListComponent, PostAddComponent],
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.css'
})
export class PostsComponent {

}
